package starter.user.Authentication;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class Register {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint to register")
    public String setApiRegister(){
        return url + "auth/register";
    }

    /*
    Register Valid Credentials
     */
    @Step("I send request to register and fill valid credential(email, password, fullname)")
    public void sendRegisterValid(){
        Faker faker = new Faker();
        JSONObject requestBody = new JSONObject();
        String name = faker.name().fullName();
        String email = faker.name().firstName();

        requestBody.put("email", email + "@mail.com");
        requestBody.put("password", "12345678");
        requestBody.put("fullname", name);

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiRegister());
    }

    @Step("I receive my registered account data")
    public void receiveValidRegistered(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.REGISTER_USER_SCHEMA);

        restAssuredThat(response -> response.body("'data'.'ID'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Fullname'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Email'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Password'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    /*
    Register invalid email
     */
    @Step("I send request to register and fill valid credential(email, password, fullname)")
    public void sendRegisterInvalidEmail(){
        JSONObject requestBody = new JSONObject();
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = faker.name().firstName();
        requestBody.put("email", email);
        requestBody.put("password", "12345678");
        requestBody.put("fullname", name);

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiRegister());
    }

    /*
    Register Blank Credential
     */
    @Step("I send request to register and fill blank one credential")
    public void sendRegisterBlank(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "");
        requestBody.put("password", "12345678");
        requestBody.put("fullname", "john wkwk");

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiRegister());
    }

}
