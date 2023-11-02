package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductRatingsByInvalidID {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint with an invalid ID to get product ratings")
    public String setApiGetEndRatingsInvalidId(){
        return url + "products/999";
    }

    @Step("I send request to get product ratings using invalid ID")
    public void sendGetRatingsInvalidId(){
        SerenityRest.given().get(setApiGetEndRatingsInvalidId());
    }
}
