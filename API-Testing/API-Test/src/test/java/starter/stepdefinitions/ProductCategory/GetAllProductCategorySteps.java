package starter.stepdefinitions.ProductCategory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.ProductCategory.GetAllProductCategory;
import starter.user.StatusCode;
import starter.user.products.GetAllProduct;

public class GetAllProductCategorySteps {
    @Steps
    GetAllProductCategory getAllProductCategory;

    @Steps
    StatusCode statusCode;

    @Given("I set API endpoint to get all product category")
    public void setApiEndProfile(){
        getAllProductCategory.setApiEndGetAllProductCategory();
    }

    @When("I send request to get all product category")
    public void sendUserRequest(){
        getAllProductCategory.sendRequestProductCategory();
    }

    @And("I receive all of product category")
    public void receiveValidProfile(){
        getAllProductCategory.receiveValidProductCategory();
    }
}
