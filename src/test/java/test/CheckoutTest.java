package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.*;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest {

    @Steps
    HeaderPageSteps headerPageSteps;

    @Steps
    ProductPageSteps productPageSteps;

    @Steps
    ProductDetailsSteps productDetailsSteps;

    @Steps
    SearchPageSteps searchPageSteps;

    @Steps
    CartPageSteps cartPageSteps;

    @Steps
    CheckoutPageSteps checkoutPageSteps;

    @Test
    public void checkoutTest(){
        headerPageSteps.goToProductsPage();
        productPageSteps.selectAProduct();
        productDetailsSteps.configureProductAndAddToCart();
        searchPageSteps.addProductFromSearch();
        cartPageSteps.proceedToCheckout();
        checkoutPageSteps.selectCheckoutMethodAndContinue();
        checkoutPageSteps.completeTheCheckoutStepsAndPlaceOrder();
    }
}
