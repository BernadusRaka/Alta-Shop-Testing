package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By.ByXPath loginPageValidation(){
        return new By.ByXPath("//*[@id=\"app\"]/div/main/div/div/div/div[1]");
    }

    @Step
    public boolean validateLoginPage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(loginPageValidation()).isDisplayed();
    }

    private By.ByXPath loginButton(){
        return new By.ByXPath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }

    @Step
    public void loginClick(){
        $(loginButton()).click();
    }

    /*
    Login using valid credential
    */
    private By.ByXPath emailForm(){
    return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }
    @Step
    public void fillValidEmail(String email){
        $(emailForm()).type(email);
    }

    private By.ByXPath passwordForm(){
    return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    @Step
    public void fillValidPassword(String password){
        $(passwordForm()).type(password);
    }

    private By.ByXPath loggedInUser(){
    return new By.ByXPath("//*[@id=\"app\"]/div/header/div/button[2]/span");
    }

    @Step
    public boolean validateLoginUser(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(loggedInUser()).isDisplayed();
    }

    /*
    Login with invalid email
     */

    @Step
    public void fillInvalidEmail(String email){
        $(emailForm()).type(email);
    }

    private By.ByXPath errorMessageInvalidEmail(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    @Step
    public boolean validateInvalidEmail(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(errorMessageInvalidEmail()).isDisplayed();
    }

    /*
    Login with wrong password
     */
    @Step
    public void fillInvalidPassword(String password){
        $(passwordForm()).type(password);
    }

    private By.ByXPath errorMessageIncorrectPassword(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }
    @Step
    public boolean validationErrorPassword(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(errorMessageIncorrectPassword()).isDisplayed();
    }

    /*
    Login empty credential
     */
    public boolean emptyEmail(){
        return $(emailForm()).isDisplayed();
    }

    public boolean emptyPassword(){
        return $(passwordForm()).isDisplayed();
    }

    private By.ByXPath errorEmptyCredential(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    public boolean errorMessageEmptyCredential(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(errorEmptyCredential()).isDisplayed();
    }

    /*
    Redirected to Register page
     */
    private By.ByXPath registerButton(){
        return new By.ByXPath("/html/body/div/div/main/div/div/div/div[2]/div/a");
    }

    public void clickRegisterButton(){
        $(registerButton()).click();
    }



}
