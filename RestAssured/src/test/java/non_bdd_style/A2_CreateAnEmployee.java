package non_bdd_style;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class A2_CreateAnEmployee {
    
    @Test
    public void createEmployee() {
        
        RestAssured.baseURI = "http://localhost:3000/";
        
        RequestSpecification requestSpecification = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\r\n"
                        + "  \"first_name\": \"Agni\",\r\n"
                        + "  \"last_name\": \"A\",\r\n"
                        + "  \"email\": \"Agni@arulprasath.com\"\r\n"
                        + "}");
        
        Response response = requestSpecification.request(Method.POST, "employees");
        
        System.out.println(response.getStatusLine());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
