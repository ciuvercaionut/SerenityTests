package steps;

import net.thucydides.core.annotations.Step;
import page.ProductDetailsPage;

public class ProductDetailsSteps {

    ProductDetailsPage productDetailsPage;

//    @Step
//    public void selectARandomColor(){
//        productDetailsPage.selectAColor();
//    }
//
//    @Step
//    public void selectARandomSize(){
//        productDetailsPage.selectSize();
//    }
//
//    @Step
//    public void addToCart(){
//        productDetailsPage.addToCart();
//    }

    @Step
    public void configureProductAndAddToCart(){
        productDetailsPage.selectAColor();
        productDetailsPage.selectSize();
        productDetailsPage.addToCart();
    }

}
