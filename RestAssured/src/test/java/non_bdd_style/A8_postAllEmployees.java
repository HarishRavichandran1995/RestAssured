package non_bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class A8_postAllEmployees {
	
	@Test
	public void postAllEmployeesBDD() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type", "application/json")
		.body("{\r\n"
                + "  \"first_name\": \"Agni\",\r\n"
                + "  \"last_name\": \"A\",\r\n"
                + "  \"email\": \"Agni@arulprasath.com\"\r\n"
                + "}")
		.when()
		.post("employees")
		.prettyPrint();
	}}