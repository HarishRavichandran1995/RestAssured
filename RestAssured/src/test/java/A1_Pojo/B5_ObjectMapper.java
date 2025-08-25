package A1_Pojo;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class B5_ObjectMapper {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		B4_Employee employee1 = new B4_Employee();
		employee1.setFirst_name("Harish");
		employee1.setLast_name("Ravichandran");
		employee1.setEmail("harishravichandran1995.com");
		employee1.setSkills(Arrays.asList("Java","Selenium"));
		System.out.println(employee1.getFirst_name());
		System.out.println(employee1.getLast_name());
		System.out.println(employee1.getEmail());
		System.out.println(employee1.getSkills());
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1));
	}
}
