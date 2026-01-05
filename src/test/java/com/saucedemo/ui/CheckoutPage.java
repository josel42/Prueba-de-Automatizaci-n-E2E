package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target CHECKOUT_BUTTON =
            Target.the("checkout button")
                    .locatedBy("#checkout");

    public static final Target FIRST_NAME =
            Target.the("first name")
                    .locatedBy("#first-name");

    public static final Target LAST_NAME =
            Target.the("last name")
                    .locatedBy("#last-name");

    public static final Target POSTAL_CODE =
            Target.the("postal code")
                    .locatedBy("#postal-code");

    public static final Target CONTINUE =
            Target.the("continue button")
                    .locatedBy("#continue");

    public static final Target FINISH =
            Target.the("finish button")
                    .locatedBy("#finish");

    public static final Target CONFIRMATION =
            Target.the("confirmation message")
                    .locatedBy(".complete-header");
}
