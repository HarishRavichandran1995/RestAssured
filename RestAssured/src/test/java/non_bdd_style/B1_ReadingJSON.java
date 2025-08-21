package non_bdd_style;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class B1_ReadingJSON {
	
	@Test
	public void readFile() {
		File file = new File("read.json");
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type", "application/json")
		.body(file)
		.when()
		.post("/employees")
		.prettyPrint();
	}
}
