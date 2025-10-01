package C08_Auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIKeyAuth {
	
	@Test(enabled = false)
	public void apiKeyAuth() {
		RestAssured
		.given()
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=chennai&appId=493e6e5a03a90b3b2d79f8daed6c3382")
		.prettyPrint();
	}
	@Test
	public void apiKeyAuthUsingParams() {
		RestAssured
		.given()
		.queryParam("q", "chennai")
		.queryParam("appId", "493e6e5a03a90b3b2d79f8daed6c3382")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log()
		.all();
	}
}


