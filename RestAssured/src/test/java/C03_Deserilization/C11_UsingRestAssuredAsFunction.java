package C03_Deserilization;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class C11_UsingRestAssuredAsFunction {
	
	public static void UsingRestAssuredAsFunction() {
		Map<String, Object> asFunction = RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees/1")
		.then()
		.extract()
		.body()
		.as(new TypeRef<Map<String, Object>>() {
		});
		
		System.out.println(asFunction.get("first_name"));
		System.out.println(asFunction.get("last_name"));
		System.out.println(asFunction.get("email"));
		System.out.println(asFunction.get("skills"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingRestAssuredAsFunction();
	}
}
