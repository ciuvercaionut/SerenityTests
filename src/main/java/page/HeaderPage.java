package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://qa2.dev.evozon.com/customer/account/")
public class HeaderPage extends AbstractPage{


    @FindBy(css =".nav-2")
    private WebElementFacade category;

    @FindBy(css = ".nav-2-3")
    private WebElementFacade subcategory;

    public void navigateToAProductSubcategory(){
        Actions action = new Actions(getDriver());
        action.moveToElement(category).perform();
        action.moveToElement(subcategory).click().perform();
    }
}
