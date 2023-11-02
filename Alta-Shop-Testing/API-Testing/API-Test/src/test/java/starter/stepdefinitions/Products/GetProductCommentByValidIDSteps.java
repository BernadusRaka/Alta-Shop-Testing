package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductCommentByValidID;
import starter.user.products.GetProductRatingsByValidID;


public class GetProductCommentByValidIDSteps {

    @Steps
    GetProductCommentByValidID getProductCommentByValidID;

    @Given("I set API endpoint with an valid ID to get product comment by ID")
    public void setApiGetEndInvalidIdProfile(){
        getProductCommentByValidID.setApiGetEndComment();
    }

    @When("I send request to get product comment using valid ID")
    public void sendGetRequestInvalidIdProfile(){
        getProductCommentByValidID.sendGetRequestCommentInvalidId();
    }

    @And("I receive all of product comment using valid ID")
    public void receiveValidProfile(){
        getProductCommentByValidID.receiveValidComment();
    }

}
