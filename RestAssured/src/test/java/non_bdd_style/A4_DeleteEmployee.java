package non_bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class A4_DeleteEmployee {

	@Test
	public void deleteAnEmployee() {
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response request = requestSpecification.request(Method.DELETE,"employees/2");
		System.out.println(request.asPrettyString());
	}
}
