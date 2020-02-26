package steps;

import net.thucydides.core.annotations.Step;
import page.ProductListPage;

public class ProductPageSteps {

    ProductListPage productListPage;

    @Step
    public void selectAProduct(){
        productListPage.selectAProduct();
    }
}
