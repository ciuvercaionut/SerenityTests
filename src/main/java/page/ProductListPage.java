package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductListPage extends AbstractPage {

    @FindBy(css = ".product-image[title*= 'Core']")
    private WebElementFacade specificProduct;

    public void selectAProduct(){
        specificProduct.click();
    }


}
