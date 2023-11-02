package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductCommentByInvalidID {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint with an invalid ID to get product comments")
    public String setApiGetEndCommentsInvalidId(){
        return url + "products/9999/comments";
    }

    @Step("I send request to get product comments using invalid ID")
    public void sendGetCommentsInvalidId(){
        SerenityRest.given().get(setApiGetEndCommentsInvalidId());
    }
}
