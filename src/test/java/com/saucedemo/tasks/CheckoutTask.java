package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.ui.CheckoutPage.*;

public class CheckoutTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKOUT_BUTTON),
                Enter.theValue("Jose").into(FIRST_NAME),
                Enter.theValue("Carrera").into(LAST_NAME),
                Enter.theValue("17001").into(POSTAL_CODE),
                Click.on(CONTINUE),
                Click.on(FINISH)
        );
    }

    public static CheckoutTask completePurchase() {
        return new CheckoutTask();
    }
}
