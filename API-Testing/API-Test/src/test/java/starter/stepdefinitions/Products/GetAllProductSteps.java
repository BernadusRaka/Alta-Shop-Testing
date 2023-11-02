package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetAllProduct;
import starter.user.StatusCode;

public class GetAllProductSteps {
    @Steps
    GetAllProduct getAllProduct;

    @Steps
    StatusCode statusCode;

    @Given("I set API endpoint to get all product")
    public void setApiEndProfile(){
        getAllProduct.setApiEndGetAllProduct();
    }

    @When("I send request to get all product")
    public void sendUserRequest(){
        getAllProduct.sendRequestProduct();
    }

    @And("I receive all of product details")
    public void receiveValidProfile(){
        getAllProduct.receiveValidProfile();
    }
}
