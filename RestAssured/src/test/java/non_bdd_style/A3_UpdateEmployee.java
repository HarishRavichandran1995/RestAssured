package non_bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class A3_UpdateEmployee {
	
	@Test
	public void updateAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json")
		.body("{\r\n"
                + "  \"first_name\": \"Agni\",\r\n"
                + "  \"last_name\": \"Agni\",\r\n"
                + "  \"email\": \"Ag@arulprasath.com\"\r\n"
                + "}");
		Response response = requestSpecification.request(Method.PUT,"http://localhost:3000/employees/2");
		System.out.println(response.asPrettyString());
	}

}
