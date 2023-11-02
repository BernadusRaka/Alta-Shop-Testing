package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    HomePage homePage;
    @Steps
    LoginPage loginPage;

    /*
    Login Using Valid Credential
     */
    @When("I click \"door out\" button")
    public void clickDoorButton(){
        homePage.toLoginPage();
    }

    @And("I am on login page")
    public void loginPage(){
        loginPage.validateLoginPage();
    }


    @And("I enters a valid \"email\"")
    public void fillEmail() {
        loginPage.fillValidEmail("johnwick@mail.com");
    }

    @And("I enters a valid \"password\" that i used")
    public void fillPassword(){
        loginPage.fillValidPassword("johnwick");
    }

    @And("I clicks the \"Login\" button")
    public void clickLogin(){
        loginPage.loginClick();
    }

    @Then("the user should be redirected to the main application page")
    public void homePageLogin(){
        loginPage.validateLoginUser();
    }

    /*
    Login using invalid email
     */

    @And("I enter an invalid \"email\"")
    public void enterInvalidEmail(){
        loginPage.fillInvalidEmail("johnwick");
    }

    @Then("I should receive an error message for invalid email")
    public void errorForInvalidEmail(){
        loginPage.validateInvalidEmail();
    }

    /*
    Login using incorrect password
     */

    @And("I enters an incorrect \"password\"")
    public void enterIncorrectPassword(){
        loginPage.fillInvalidPassword("johncena");
    }

    @Then("I receives an error message for incorrect password")
    public void errorMessageForPassword(){
        loginPage.validationErrorPassword();
    }

    /*
    Login with empty credential
     */

    @And("both the email and password fields are left empty")
    public void emptyCredentialForm(){
        loginPage.emptyEmail();
        loginPage.emptyEmail();
    }

    @Then("I receives an error message because of empty form")
    public void errorEmptyCredential(){
        loginPage.errorMessageEmptyCredential();
    }






}
