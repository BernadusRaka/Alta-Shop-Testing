package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class GenerateTokenCashier {
    public static String generateTokenCashier(){
        JSONObject userData = FileCashier.getCashier();
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", userData.get("username"));
        requestBody.put("password", userData.get("password"));

        ResponseBody loginResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post("https://www.ariefbook.my.id/api/v1/cashier/login")
                .body();

        JSONObject loginResponseBody = new JSONObject(loginResponse.asString());

        return loginResponseBody.getJSONObject("results").getString("token").toString();
    }
}
