package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class PurchaseProductSteps {
    @Steps
    HomePage homePage;

    @Steps
    CartPage cartPage;
    @Steps
    LoginPage loginPage;
    /*
    Logged in user want to purchase product
     */
    @And("I redirected to home page")
    public void backtoHomePage(){
        homePage.validateOnHomePage();
    }

    @And("I click the \"Buy\" button")
    public void buyProduct(){
        homePage.clickBuyButton();
    }

    @And("I click \"cart\" button")
    public void checkCart(){
        homePage.clickCartButton();
    }

    @And("I should verify that the product has been successfully added to the cart")
    public void verifyProduct(){
        cartPage.verifyProductisAdded();
    }

    @And("I click \"Purchase\" button")
    public void purchaseProduct(){
        cartPage.clickPurchaseButton();
    }

    @Then("I receive payment confirmation")
    public void purchasingVerification(){
        cartPage.paymentVerification();
    }

    /*
    User that not logged in yet want to purchase a product
     */

    @Then("I should be directed to the login page")
    public void backToLoginPage(){
        loginPage.validateLoginPage();
    }

    /*
    User want to change product quantity that wanted to purchase
     */

    @And("I click \"+\" or \"-\" button")
    public void changeQuantity(){
        cartPage.add1Product();
    }

    /*
    User want to purchase more than one type of product
     */

    @And("I click the \"Buy\" or \"Add to Cart\" button for first product")
    public void buyProduct1(){
        homePage.clickBuyButton();
    }

    @And("I click the \"Buy\" or \"Add to Cart\" button for another product")
    public void buyProduct2(){
        homePage.clickBuySecondProduct();
    }

    @And ("I should verify that the first product has been successfully added to the cart")
    public void firstProduct(){
        cartPage.product1Added();
    }

    @And ("I should verify that the second product has been successfully added to the cart")
    public void secondProduct(){
        cartPage.product2Added();
    }





}
