package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.DeleteProductByID;
import starter.user.products.DeleteProductByInvalidID;

public class DeleteProductByInvalidIDSteps {
    @Steps
    DeleteProductByInvalidID deleteProductByInvalidID;

    @Given("I set API endpoint for delete product with invalid id")
    public void setDeleteValidUserSteps(){
        deleteProductByInvalidID.setApiDeleteProductInvalidId();
    }

    @When("I send request to delete product with invalid ID")
    public void sendDeleteUserRequest(){
        deleteProductByInvalidID.sendDeleteProductInvalidIdRequest();
    }

}
