package com.saucedemo.runners;

import com.saucedemo.tasks.AddProductsTask;
import com.saucedemo.tasks.CheckoutTask;
import com.saucedemo.tasks.LoginTask;
import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class CompraE2ETest {

    @Managed
    WebDriver driver;

    Actor usuario = Actor.named("Standard User");

    @Before
    public void setUp() {
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void compra_exitosa_en_saucedemo() {
        usuario.attemptsTo(
                LoginTask.withCredentials(),
                AddProductsTask.toCart(),
                CheckoutTask.completePurchase()
        );
        usuario.should(
                seeThat(
                        Text.of(CheckoutPage.CONFIRMATION),
                        equalTo("Thank you for your order!")
                )
        );
    }
}
