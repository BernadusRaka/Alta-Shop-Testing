package starter.stepdefinitions.Index;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Index.Hello;

public class HelloSteps {
    @Steps
    Hello hello;

    @Given("I set API endpoint to get hello greetings")
    public void setApiEndUser(){
        hello.setApiHello();
    }

    @When("I send request to get hello")
    public void sendUserRequest(){
        hello.sendRequestHello();
    }

    @And("I receive hello greetings")
    public void receiveValidProfile(){
        hello.receiveHello();
    }
}
