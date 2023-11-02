package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductByID {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint for delete user with valid id")
    public String setApiDeleteProductEndpoint() {
        return url + "products/1";
    }

    @Step("I send request to delete user with valid ID")
    public void sendDeleteProductRequest() {
        SerenityRest.given().delete(setApiDeleteProductEndpoint());
    }


}
