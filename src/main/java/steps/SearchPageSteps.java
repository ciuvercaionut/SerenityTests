package steps;

import net.thucydides.core.annotations.Step;
import page.SearchPage;

public class SearchPageSteps {

    SearchPage searchPage;

    @Step
    public void addProductFromSearch(){
        searchPage.searchProduct("Eye", "eye");
        searchPage.addToCartProduct();
    }
}
