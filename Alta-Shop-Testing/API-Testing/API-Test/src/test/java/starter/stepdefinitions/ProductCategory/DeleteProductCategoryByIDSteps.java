package starter.stepdefinitions.ProductCategory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.DeleteProductCategoryByID;

public class DeleteProductCategoryByIDSteps {
    @Steps
    DeleteProductCategoryByID deleteProductCategoryByID;

    @Given("I set API endpoint for delete product category with valid id")
    public void setDeleteValidCategorySteps(){
        deleteProductCategoryByID.setApiDeleteCategoryEndpoint();
    }

    @When("I send request to delete product category with valid ID")
    public void sendDeleteProductCategoryRequest(){
        deleteProductCategoryByID.sendDeleteCategoryRequest();
    }

}
