package non_bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class A7_getAllEmployessBDD {
	
	@Test
	public void getEmployeesBDD() {
	RestAssured
	.given()
	.baseUri("http://localhost:3000/")
	.when()
	.get("employees")
	.prettyPrint();
	}

}
