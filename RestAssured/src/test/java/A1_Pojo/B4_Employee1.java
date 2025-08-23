package A1_Pojo;

import java.util.Arrays;

public class B4_Employee1 {
	public static void main(String[] args) {
	B4_Employee employee1 = new B4_Employee();
	employee1.setFirst_name("Harish");
	employee1.setLast_name("Ravichandran");
	employee1.setEmail("harishravichandran1995.com");
	employee1.setSkills(Arrays.asList("Java","Selenium"));
	System.out.println(employee1.getFirst_name());
	System.out.println(employee1.getLast_name());
	System.out.println(employee1.getEmail());
	System.out.println(employee1.getSkills());
	}
}
