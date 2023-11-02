package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductCommentByInvalidID;
import starter.user.products.GetProductCommentByValidID;
import starter.user.products.GetProductRatingsByInvalidID;


public class GetProductCommentByInvalidIDSteps {

    @Steps
    GetProductCommentByInvalidID setApiGetEndCommentsInvalidId;

    @Given("I set API endpoint with an invalid ID to get product comments")
    public void setApiGetEndInvalidIdProfile(){
        setApiGetEndCommentsInvalidId.setApiGetEndCommentsInvalidId();
    }

    @When("I send request to get product comments using invalid ID")
    public void sendGetRequestInvalidIdProfile(){
        setApiGetEndCommentsInvalidId.sendGetCommentsInvalidId();
    }

}
