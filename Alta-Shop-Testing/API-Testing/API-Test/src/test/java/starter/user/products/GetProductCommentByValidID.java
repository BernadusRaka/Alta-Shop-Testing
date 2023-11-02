package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetProductCommentByValidID {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint with an valid ID to get product comment by ID")
    public String setApiGetEndComment(){
//        int productId = ProductGetter.getProductID(); // ambil ID produk
        return url + "products/85531/comments";
    }

    @Step("I send request to get product comment using valid ID")
    public void sendGetRequestCommentInvalidId(){
        SerenityRest.given().get(setApiGetEndComment());
    }

    @Step("I receive all of product comment using valid ID")
    public void receiveValidComment(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_PRODUCT_COMMENT_SCHEMA);
        restAssuredThat(response -> response.body("'data'.'Comment'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Content'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'ID'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
