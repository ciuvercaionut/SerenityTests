package steps;

import net.thucydides.core.annotations.Step;
import page.CheckoutPage;

public class CheckoutPageSteps {

    CheckoutPage checkoutPage;

    @Step
    public void selectCheckoutMethodAndContinue(){
        checkoutPage.selectCheckoutMethod();
        checkoutPage.continueToCheckout();
    }

    @Step
    public void completeTheCheckoutStepsAndPlaceOrder(){
        checkoutPage.fillTheRequiredFieldsForBilling();
        checkoutPage.fillTheRequiredFieldsForShipping();
        checkoutPage.setShippingMethodPaymentAndPlaceOrder();
    }

}
