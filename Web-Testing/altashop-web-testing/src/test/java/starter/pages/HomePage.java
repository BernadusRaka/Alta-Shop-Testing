package starter.pages;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    /*
    This section is for validate home page
    */
    private By title(){
        return By.className("v-toolbar__title");
    }

    @Step
    public boolean validateOnHomePage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(title()).isDisplayed();
    }


    /*
    This section is for opening detail products page
    */
    private By.ByXPath productTitle(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[1]");
    }
    @Step
    public boolean validateProduct(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(productTitle()).isDisplayed();
    }

    private By.ByXPath detailButton(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[1]");
    }

    @Step
    public void clickDetailButton(){
        $(detailButton()).click();
    }

    /*
    This section is for choosing product category on home page
    */

    private By.ByXPath category(){
        return new By.ByXPath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[3]/div");
    }
    @Step
    public void clickCategoryButton(){
        $(category()).click();
    }

    private By chooseGaming(){
        return By.className("v-list-item__content");
    }

    @Step
    public void chooseGamingButton(){
        $(chooseGaming()).click();
        }


    /*
    This section is for redirected to login page
     */

    private By.ByXPath clickDoorOutButton(){
        return new By.ByXPath("//*[@id=\"app\"]/div/header/div/button[2]");
    }

    @Step
    public void toLoginPage(){
        $(clickDoorOutButton()).click();
    }

    /*
    This section is for redirected to cart page and purchase product
     */
    private By.ByXPath buyButton(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[2]");
    }
    @Step
    public void clickBuyButton(){
        $(buyButton()).click();
    }

    private By.ByXPath cartButton(){
        return new By.ByXPath("/html/body/div/div/header/div/button[1]/span");
    }
    @Step
    public void clickCartButton(){
        $(cartButton()).click();
    }

    private By.ByXPath buySecondProductButton(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div[2]/div/div[2]/div/div[3]/div[2]/button[2]");
    }
    @Step
    public void clickBuySecondProduct(){
        $(buySecondProductButton()).click();
    }









}
