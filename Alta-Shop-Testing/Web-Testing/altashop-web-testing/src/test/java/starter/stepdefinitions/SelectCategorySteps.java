package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CategoryPage;
import starter.pages.HomePage;

public class SelectCategorySteps {
    @Steps
    HomePage homePage;

    @Steps
    CategoryPage categoryPage;

    @Given("the shopping application is opened")
    public void onTheHomePage(){
        homePage.openUrl("https://alta-shop.vercel.app/");
        Assertions.assertTrue(homePage.validateOnHomePage());
    }

    @When("the user searches for and clicks on the \"Product Categories\" menu or icon")
    public void clickCategory(){
        homePage.clickCategoryButton();
    }

    @And("selects the \"Gaming\" category")
    public void clickGaming(){
        homePage.chooseGamingButton();
    }

    @Then("I should be directed to the \"Gaming\" product page")
    public void gamingPage(){
        categoryPage.gamingCategory();
    }

//    @And("I should verify that the \"Gaming\" products are displayed correctly")
//    public void gamingProduct(){}
}
