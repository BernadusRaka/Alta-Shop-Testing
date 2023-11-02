package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductByInvalidID;
import starter.user.products.GetProductRatingsByValidID;


public class GetProductRatingsByValidIDSteps {

    @Steps
    GetProductRatingsByValidID getProductRatingsByValidID;

    @Given("I set API endpoint with an valid ID to get product ratings by ID")
    public void setApiGetEndInvalidIdProfile(){
        getProductRatingsByValidID.setApiGetEndRatings();
    }

    @When("I send request to get product ratings using valid ID")
    public void sendGetRequestInvalidIdProfile(){
        getProductRatingsByValidID.sendGetRequestRatingInvalidId();
    }

    @And("I receive all of product ratings using valid ID")
    public void receiveValidProfile(){
        getProductRatingsByValidID.receiveValidRatings();
    }

}
