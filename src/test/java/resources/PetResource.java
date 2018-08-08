package resources;

import com.jayway.restassured.response.Response;
import utils.APILogger;
import utils.Properties;

import static com.jayway.restassured.RestAssured.given;

public class PetResource {

    public Response post(String s) {
        new APILogger().log("Pet Request --" + s);
        Response response = given().request().with()
                .header("Content-Type", "application/json")
                .body(s)
                .when()
                .post(Properties.createPet);
        new APILogger().log("Pet Response --" + response.asString());
        return response;
    }
}
