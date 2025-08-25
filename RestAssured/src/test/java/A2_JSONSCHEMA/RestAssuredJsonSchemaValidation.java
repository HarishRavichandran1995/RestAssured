package A2_JSONSCHEMA;


import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {
	
	@Test
	public void ValidationUsingJsonSchemaInClassPath() {
		
		File file = new File("src/test/resources/readJson.json");
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body(file)
		.log()
		.all()
		.when()
		.post("/employees")
		.then()
		.log()
		.all()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}
}
