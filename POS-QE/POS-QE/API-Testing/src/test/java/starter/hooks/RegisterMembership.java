package starter.hooks;

import io.cucumber.java.Before;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class RegisterMembership {
    @Before(value = "@RegisterMembership")
    public static void beforeTest() {

        String name = "TEST01";
        String numberPhone = "082233164665";

        JSONObject requestBody = new JSONObject();

        requestBody.put("Name", name);
        requestBody.put("PhoneNumber", numberPhone);

        String filePath = "src/test/resources/sample/Membership.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
