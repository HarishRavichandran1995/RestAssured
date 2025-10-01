package C07_RequestSpecification;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecBuilderEx {
	public static void main(String[] args) {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost:3000/");
		builder.setBasePath("employees");
		RequestSpecification requestSpecification = builder.build();
		
		//RequestSpecification requestSpecification2 = builder.setBaseUri("http://localhost:3000/")
		//.setBaseUri("http://localhost:3000/").setContentType(ContentType.JSON).build();
		
		RestAssured
		.given()
		.spec(requestSpecification)
		.when()
		.get("/1")
		.prettyPrint();
	}
}
