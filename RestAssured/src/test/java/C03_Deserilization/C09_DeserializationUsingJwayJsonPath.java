package C03_Deserilization;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class C09_DeserializationUsingJwayJsonPath {
	static String jsonString = "{\r\n"
			+ "  \"first_name\" : \"Harish\",\r\n"
			+ "  \"last_name\" : \"Ravichandran\",\r\n"
			+ "  \"email\" : \"harishravichandran1995.com\",\r\n"
			+ "  \"skills\" : [ \"Java\", \"Selenium\" ]\r\n"
			+ "}";
	
	public static void deserializationUsingJwayJsonPath() {
		JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
		Configuration configuration = Configuration
		.builder()
		.mappingProvider(mappingProvider)
		.build();
		C08_Employee c08_Employee = JsonPath
		.using(configuration)
		.parse(jsonString)
		.read("$",C08_Employee.class);
		System.out.println(c08_Employee.getFirst_name());
		System.out.println(c08_Employee.getLast_name());
		System.out.println(c08_Employee.getEmail());
		System.out.println(c08_Employee.getSkills());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deserializationUsingJwayJsonPath();
	}
}
