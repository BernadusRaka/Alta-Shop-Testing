package starter.user.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllOrders {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step(" I set API endpoint to get all my order")
    public String setApiAllMyOrder(){
        return url + "orders";
    }

    @Step("I send request to get all my order")
    public void sendRequestAllMyOrder(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImpvaG4gdyIsIkVtYWlsIjoiam9obndAbWFpbC5jb20ifQ.wYwcr35HUl3N7bYaiPupvRl7-VEfyQ-8GfwWg9WXs40";
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
//                .header("User-Agent", "PostmanRuntime/7.34.0")
//                .header("Accept", "*/*")
//                .header("Accept-Encoding", "gzip, deflate, br")
//                .header("Connection", "keep-alive")
                .get(setApiAllMyOrder());
    }

    @Step("I receive all of my order")
    public void receiveValidOrder(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_ORDER_SCHEMA);

        restAssuredThat(response -> response.body("'data'.''",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }

}
