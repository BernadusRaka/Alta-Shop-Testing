package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteProductByInvalidID {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint for delete product with invalid id")
    public String setApiDeleteProductInvalidId() {
        return url + "products/7777777";
    }

    @Step("I send request to delete product with invalid ID")
    public void sendDeleteProductInvalidIdRequest() {
        SerenityRest.given().delete(setApiDeleteProductInvalidId());
    }


}
