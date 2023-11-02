package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.DeleteProductByID;

public class DeleteProductByIDSteps {
    @Steps
    DeleteProductByID deleteProductByIDSteps;

    @Given("I set API endpoint for delete product with valid id")
    public void setDeleteValidUserSteps(){
        deleteProductByIDSteps.setApiDeleteProductEndpoint();
    }

    @When("I send request to delete product with valid ID")
    public void sendDeleteUserRequest(){
        deleteProductByIDSteps.sendDeleteProductRequest();
    }

}
