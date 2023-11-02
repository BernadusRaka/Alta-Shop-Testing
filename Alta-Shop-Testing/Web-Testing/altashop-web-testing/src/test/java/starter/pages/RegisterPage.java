package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    /*
    Register with valid credential
     */
    private By.ByXPath registerTitle(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[1]");
    }
    @Step
    public boolean verifyRegisterPage(){
        return $(registerTitle()).isDisplayed();
    }

    private By.ByXPath usernameForm(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }
    @Step
    public void fillUsername(String username){
        $(usernameForm()).type(username);
    }

    private By.ByXPath emailForm(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }
    @Step
    public void fillEmail(String email){
        $(emailForm()).type(email);
    }

    private By.ByXPath passwordForm(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }
    @Step
    public void fillPassword(String password){
        $(passwordForm()).type(password);
    }

    private By.ByXPath registerButton(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/form/div[4]/button");
    }
    @Step
    public void clickRegister(){
        $(registerButton()).click();
    }

    /*
    Register using used username
     */
    public void fillUsedUsername(String username){
        $(usernameForm()).type(username);
    }

    private By.ByXPath errorUsername(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/div[1]");
    }
    @Step
    public boolean errorMessageUsedUsername(){
        return $(errorUsername()).isDisplayed();
    }

    /*
    Register with invalid email
     */
    @Step
    public void fillInvalidEmail(String email){
        $(emailForm()).type(email);
    }

    /*
    Blank form
     */
    @Step
    public void blankForm(){
        $(emailForm()).isDisplayed();
        $(passwordForm()).isDisplayed();
        $(usernameForm()).isDisplayed();
    }





}
