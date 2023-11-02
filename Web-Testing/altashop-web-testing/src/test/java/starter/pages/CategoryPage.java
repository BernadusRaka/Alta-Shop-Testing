package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryPage extends PageObject {
    private By titleCategory(){
        return By.className("v-select__selections");
    }

    public boolean gamingCategory(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(titleCategory()).isDisplayed();
    }



}
