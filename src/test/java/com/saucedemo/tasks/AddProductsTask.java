package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.ui.InventoryPage.*;

public class AddProductsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_BACKPACK),
                Click.on(ADD_BIKE_LIGHT),
                Click.on(CART)
        );
    }

    public static AddProductsTask toCart() {
        return new AddProductsTask();
    }
}
