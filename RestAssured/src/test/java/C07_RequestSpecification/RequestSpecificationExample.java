package C07_RequestSpecification;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {
	RequestSpecification requestSpecification;
	
	@BeforeSuite
	public void setRequestSpecification() {
		requestSpecification = RestAssured
				.given()
				.baseUri("http://localhost:3000/")
				.basePath("employees");		
	}
	
	@Test
	public void getEmployeesBDD() {
	RestAssured
	.given()
	.spec(requestSpecification)
	.when()
	.get()
	.prettyPrint();
	}
	
	@Test
	public void getEmployeeBDD_one() {
	RestAssured
	.given()
	.spec(requestSpecification)
	.when()
	.get("/1")
	.prettyPrint();
	}
}
