package C03_Deserilization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C08_UsingObjectMapper {

	 String jsonString = "{\r\n"
			+ "  \"first_name\" : \"Harish\",\r\n"
			+ "  \"last_name\" : \"Ravichandran\",\r\n"
			+ "  \"email\" : \"harishravichandran1995.com\",\r\n"
			+ "  \"skills\" : [ \"Java\", \"Selenium\" ]\r\n"
			+ "}";
	public void objectMapperDeserilization() throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		C08_Employee employee = mapper.readValue(jsonString, C08_Employee.class);
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
	}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
	 C08_UsingObjectMapper objectName = new C08_UsingObjectMapper();
	 objectName.objectMapperDeserilization();
	}
}
