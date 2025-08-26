package A2_JSONSCHEMA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class MatchesJsonSchema {
	
	@Test
	public void testMatchesJsonSchema() throws FileNotFoundException {
		File file = new File("src/test/resources/readJson.json");
		FileReader inputStream = new FileReader(file); 
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
		.body(JsonSchemaValidator.matchesJsonSchema(inputStream));
	}

}
