package C03_Deserilization;

import io.restassured.path.json.JsonPath;

public class C10_DeserializationUsingRestAssured {
	
	static String jsonString = "{\r\n"
			+ "  \"first_name\" : \"Harish\",\r\n"
			+ "  \"last_name\" : \"Ravichandran\",\r\n"
			+ "  \"email\" : \"harishravichandran1995.com\",\r\n"
			+ "  \"skills\" : [ \"Java\", \"Selenium\" ]\r\n"
			+ "}";
	
	public static void deserializationUsingRestAssured() {
		JsonPath jsonPath = JsonPath.from(jsonString);
		C08_Employee employee = jsonPath.getObject("", C08_Employee.class);
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());;
		System.out.println(employee.getEmail());;
		System.out.println(employee.getSkills());;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deserializationUsingRestAssured();
	}
}
