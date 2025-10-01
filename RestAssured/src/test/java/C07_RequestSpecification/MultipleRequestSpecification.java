package C07_RequestSpecification;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MultipleRequestSpecification {
	RequestSpecification rs;
	
	@BeforeSuite
	public void setRequestSpecification() {
		rs = RestAssured
				.given()
				.baseUri("http://localhost:3000/")
				.basePath("employees");
		RestAssured.requestSpecification = rs;
		
	}
	
	@Test
	public void getEmployeesBDD() {
	RestAssured
	.given()
	.when()
	.get()
	.prettyPrint();
	}
	
	@Test
	public void getEmployeeBDD_one() {
	RestAssured
	.given()
	.when()
	.get("/1")
	.prettyPrint();
	}
	
	@Test
	public void postEmployeeBDD_Two() {
		RequestSpecification spec = RestAssured
				.given()
				.baseUri("http://localhost:3000/")
				.basePath("employees")
				.contentType(ContentType.JSON);	
		RestAssured
		.given(spec)
		.body("{\r\n"
                + "  \"first_name\": \"Agni\",\r\n"
                + "  \"last_name\": \"A\",\r\n"
                + "  \"email\": \"Agni@arulprasath.com\"\r\n"
                + "}")
		.when()
		.post()
		.prettyPrint();	
	}
}
