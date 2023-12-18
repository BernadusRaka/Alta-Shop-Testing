package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;


public class GenerateTokenSuperAdmin {
    @Step("Super Admin mengirim request untuk mendapatkan semua Super Admin")
    public static String generateTokenSuperAdmin() {
        JSONObject userData = FileSuperAdmin.getSuperAdmin();
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "arieflazuardi");
        requestBody.put("password", "12345678");

        ResponseBody loginResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post("https://qbills.biz.id/api/v1/super-admin/login")
                .body();

        JSONObject loginResponseBody = new JSONObject(loginResponse.asString());
        return loginResponseBody.getJSONObject("results").getString("token").toString();
    }

}
