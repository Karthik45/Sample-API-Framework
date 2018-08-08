package tests;

import com.jayway.restassured.RestAssured;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseAPITest {

    public BaseAPITest() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @BeforeMethod(alwaysRun = true)
    public void testSetup(Method method) {
        Reporter.log("Test Method Name -- " + method.getName(), true);
    }

}
