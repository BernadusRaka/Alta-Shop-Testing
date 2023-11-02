package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailProductPage extends PageObject {

    /*
    Validation for product detail page with valid id
     */
    private By.ByXPath validateDetailPage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new By.ByXPath("//*[@id=\"app\"]/div/main/div/div/div/div");
    }

    public boolean detailPageValidation(){
        return $(validateDetailPage()).isDisplayed();
    }

    /*
    Validation for product detail with invalid id
     */
    private By.ByXPath validateDetailInvalidID(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new By.ByXPath("//*[@id=\"app\"]/div/main/div/div/div");
    }

    public boolean invalidIDPageValidation(){
        return $(validateDetailInvalidID()).isDisplayed();
    }
}
