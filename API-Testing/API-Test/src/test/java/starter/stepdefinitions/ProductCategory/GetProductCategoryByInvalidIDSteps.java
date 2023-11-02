package starter.stepdefinitions.ProductCategory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.ProductCategory.GetProductCategoryByInvalidID;
import starter.user.products.GetProductByInvalidID;


public class GetProductCategoryByInvalidIDSteps {

    @Steps
    GetProductCategoryByInvalidID getProductCategoryByInvalidID;

    @Given("I set API endpoint with an invalid ID to get product category")
    public void setApiGetEndInvalidIdProfile(){
        getProductCategoryByInvalidID.setApiGetEndInvalidIdCategory();
    }

    @When("I send request to get product category using invalid ID")
    public void sendGetRequestInvalidIdProfile(){
        getProductCategoryByInvalidID.sendGetRequestCategoryInvalidId();
    }

}
