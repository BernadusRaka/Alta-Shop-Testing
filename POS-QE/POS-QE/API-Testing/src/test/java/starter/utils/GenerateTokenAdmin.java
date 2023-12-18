package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static starter.URL.urlAdmin;

public class GenerateTokenAdmin {
    public static String generateTokenAdmin(){
        JSONObject userData = FileAdmin.getLoginAdmin();
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "arieflazuardi3");
        requestBody.put("password", "12345678");

        ResponseBody loginResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(urlAdmin+"login")
                .body();

        JSONObject loginResponseBody = new JSONObject(loginResponse.asString());
        return loginResponseBody.getJSONObject("results").getString("token").toString();
    }
}
