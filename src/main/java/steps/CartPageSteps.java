package steps;

import net.thucydides.core.annotations.Step;
import page.CartPage;

import static org.junit.Assert.assertEquals;

public class CartPageSteps {

    CartPage cartPage;

    @Step
    public void proceedToCheckout(){
        assertEquals(2, cartPage.getNumberOfElementsFromCartProductsList());
        cartPage.proceedToCheckout();
    }

}
