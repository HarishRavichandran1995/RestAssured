package non_bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class A9_PutAndDeleteBDD {

	@Test(enabled = false)
	public void putBddStyle() {
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
		.put("employees/2")
		.prettyPrint();

	}
	
	@Test
	public void deleteBddstyle() {
		RestAssured.
		given().
		baseUri("http://localhost:3000/")
		.when()
		.delete("employees/3")
		.prettyPrint();
	}

}
