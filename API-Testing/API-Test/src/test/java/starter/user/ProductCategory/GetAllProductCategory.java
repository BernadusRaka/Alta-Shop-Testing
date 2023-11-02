package starter.user.ProductCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllProductCategory {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint to get all product")
    public String setApiEndGetAllProductCategory(){
        return url + "categories";
    }

    @Step("I send request to get user profile")
    public void sendRequestProductCategory(){
        SerenityRest.given().get(setApiEndGetAllProductCategory());
    }



    @Step("I receive all of product details")
    public void receiveValidProductCategory(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CATEGORIES_SCHEMA);
        restAssuredThat(response -> response.body("'data'.'ID'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Name'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Description'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }


}
