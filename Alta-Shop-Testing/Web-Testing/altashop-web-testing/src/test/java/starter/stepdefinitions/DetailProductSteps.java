package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.DetailProductPage;
import starter.pages.HomePage;

public class DetailProductSteps {

    @Steps
    HomePage homePage;

    @Steps
    DetailProductPage detailProductPage;

    /*
    Detail Product with valid ID
     */
    @When("I search for the product I want to view the details of")
    public void searchProduct(){
        homePage.validateProduct();
    }

    @And("I click on the product's detail page to open it")
    public void clickButton(){
        homePage. clickDetailButton();
    }

    @Then("I should be directed to the product's detail page")
    public void validatePage(){
        detailProductPage.detailPageValidation();
    }
    /*
    Detail Product with invalid Id
     */

    @When("I change product URL to invalid product id")
    public void urlInvalidID(){
        detailProductPage.openUrl("https://alta-shop.vercel.app/products/00000");
        Assertions.assertTrue(detailProductPage.invalidIDPageValidation());
    }

    @Then("I should be directed to the blank product's detail page")
    public void blankPage(){
        detailProductPage.invalidIDPageValidation();
    }








}

