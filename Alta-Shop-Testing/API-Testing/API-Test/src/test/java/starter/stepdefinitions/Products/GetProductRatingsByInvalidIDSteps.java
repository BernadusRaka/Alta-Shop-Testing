package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductByInvalidID;
import starter.user.products.GetProductRatingsByInvalidID;


public class GetProductRatingsByInvalidIDSteps {

    @Steps
    GetProductRatingsByInvalidID getProductRatingsByInvalidID;

    @Given("I set API endpoint with an invalid ID to get product ratings")
    public void setApiGetEndInvalidIdProfile(){
        getProductRatingsByInvalidID.setApiGetEndRatingsInvalidId();
    }

    @When("I send request to get product ratings using invalid ID")
    public void sendGetRequestInvalidIdProfile(){
        getProductRatingsByInvalidID.sendGetRatingsInvalidId();
    }

}
