package tests;

import builders.PetBuilder;
import com.jayway.restassured.response.Response;
import entities.Pet;
import org.testng.annotations.Test;
import resources.PetResource;
import utils.Categories;
import utils.RequestHelper;
import utils.ResponseHelper;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class SampleTest1 extends BaseAPITest {

    @Test()
    public void createPet() throws IOException {
        Pet pet = new PetBuilder().build();

        String request = RequestHelper.getJsonString(pet);
        Response response = new PetResource().post(request);

        assertEquals(200, response.statusCode());
        Pet responsePet = (Pet) ResponseHelper.getResponseAsObject(response.asString(), Pet.class);
        assertEquals(pet.getName(), responsePet.getName());
    }
}
