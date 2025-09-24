package C06_SerilizationDeserilizationUnderstanding;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import A1_Pojo.B4_Employee;

public class Serilization_Deserialization {
	
	static String deserContent = "{\r\n"
			+ "  \"first_name\" : \"Harish\",\r\n"
			+ "  \"last_name\" : \"Ravichandran\",\r\n"
			+ "  \"email\" : \"harishravichandran1995.com\",\r\n"
			+ "  \"skills\" : [ \"Java\", \"Selenium\" ]\r\n"
			+ "}\r\n";
	
	public static void Serilization() throws JsonProcessingException {
		C08_Employee employee1 = new C08_Employee();
		employee1.setFirst_name("Harish");
		employee1.setLast_name("Ravichandran");
		employee1.setEmail("harishravichandran1995.com");
		employee1.setSkills(Arrays.asList("Java","Selenium"));
		ObjectMapper mapper = new ObjectMapper();
		String string = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		System.out.println(string);
	}
	
	public static void Deserialization() throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		C08_Employee employee = mapper.readValue(deserContent, C08_Employee.class);
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Serilization();
		System.out.println("-------------------------------------");
		Deserialization();

	}

}
