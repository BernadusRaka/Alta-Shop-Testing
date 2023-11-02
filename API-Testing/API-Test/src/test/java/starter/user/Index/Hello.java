package starter.user.Index;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class Hello {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint to get hello greetings")
    public String setApiHello(){
        return url + "hello";
    }

    @Step("I send request to get hello")
    public void sendRequestHello(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
//                .header("User-Agent", "PostmanRuntime/7.34.0")
//                .header("Accept", "*/*")
//                .header("Accept-Encoding", "gzip, deflate, br")
//                .header("Connection", "keep-alive")
                .get(setApiHello());
    }

    @Step("I receive hello greetings")
    public void receiveHello(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.HELLO_SCHEMA);

        restAssuredThat(response -> response.body("data",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }

}
