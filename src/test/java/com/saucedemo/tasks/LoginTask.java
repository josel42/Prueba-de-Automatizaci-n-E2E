package com.saucedemo.tasks;

import com.saucedemo.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static com.saucedemo.ui.LoginPage.*;

public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class),
                Enter.theValue("standard_user").into(USERNAME),
                Enter.theValue("secret_sauce").into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static LoginTask withCredentials() {
        return new LoginTask();
    }
}
