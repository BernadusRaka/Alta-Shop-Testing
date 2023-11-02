package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    RegisterPage registerPage;

    @And("I click \"register\" Button")
    public void registerButtonisClicked(){
        loginPage.clickRegisterButton();
    }

    @When("the registration page is open")
    public void onRegisterPage(){
        registerPage.verifyRegisterPage();
    }

    @And("I enter a username that has not been registered before")
    public void enterValidUsername(){
        registerPage.fillUsername("johnwick1");
    }

    @And("I enter a password that complies with security policies")
    public void enterValidPassword(){
        registerPage.fillPassword("johnwick1");
    }

    @And("I enter a valid email address")
    public void enterValidEmail(){
        registerPage.fillEmail("johnwick1@mail.com");
    }

    @And("I click the \"Register\" button")
    public void registerUser(){
        registerPage.clickRegister();
    }

    @Then("the user should be redirected to the login page")
    public void redirecttoLoginPage(){
        loginPage.validateLoginPage();
    }

    /*
    Registration using used username
     */
    @When("a username that is already registered is entered")
    public void usedUsername(){
        registerPage.fillUsedUsername("johnwick1");
    }

    @And("I should receive error message")
    public void errorMessageUsername(){
        registerPage.errorMessageUsedUsername();
    }

    /*
    User fill invalid email
     */
    @And("I enter an invalid email address \\(with incorrect email format)")
    public void invalidEmail() {
        registerPage.fillInvalidEmail("johnwick1");
    }

    /*
    user fill form with blank credential
     */

    @And("one or more fields \\(username, password, password confirmation, or email address) are left empty")
    public void blankCredential(){
        registerPage.blankForm();
    }
}
