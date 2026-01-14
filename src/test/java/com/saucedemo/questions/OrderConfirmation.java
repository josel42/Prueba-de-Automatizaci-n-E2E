package com.saucedemo.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.saucedemo.ui.CheckoutPage;

public class OrderConfirmation {

    public static Question<String> message() {
        return Text.of(CheckoutPage.ORDER_COMPLETE);
    }
}
