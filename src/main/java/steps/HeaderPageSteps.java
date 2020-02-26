package steps;

import net.thucydides.core.annotations.Step;
import page.HeaderPage;

public class HeaderPageSteps {

    HeaderPage headerPage;

    @Step
    public void goToProductsPage(){

        headerPage.navigateToAProductSubcategory();
    }
}
