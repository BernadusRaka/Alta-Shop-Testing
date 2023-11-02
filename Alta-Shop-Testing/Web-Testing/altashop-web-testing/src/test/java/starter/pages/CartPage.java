package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    private By.ByXPath productOnCart(){
       return new By.ByXPath("/html/body/div/div/main/div/div/div[1]/div/div[1]");
    }

    @Step
    public boolean verifyProductisAdded(){
        return $(productOnCart()).isDisplayed();
    }
    private By.ByXPath purchaseButton(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[2]/button");
    }

    public void clickPurchaseButton(){
        $(purchaseButton()).click();
    }

    private By.ByXPath verifyPurchase(){
        return new By.ByXPath("/html/body/div/div/main/div/div/h1");
    }

    public boolean paymentVerification(){
        return $(verifyPurchase()).isDisplayed();
    }

    /*
    This section is used for change quantity of product that want to purchased
     */

    private By.ByXPath addQuantity(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[2]/button[2]");
    }

    public void add1Product(){
        $(addQuantity()).click();
        $(addQuantity()).click();
        $(addQuantity()).click();
    }

    /*
    User want to buy more than 1 kind of product
     */

    private By.ByXPath verifyProduct1(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[1]/div/div[1]");
    }
    @Step
    public boolean product1Added(){
        return $(verifyProduct1()).isDisplayed();
    }

    private By.ByXPath verifyProduct2(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[1]/div/div[2]");
    }

    @Step
    public boolean product2Added(){
        return $(verifyProduct2()).isDisplayed();
    }


}
