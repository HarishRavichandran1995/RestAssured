package C03_Deserilization;

import java.util.Arrays;

public class C08_Employee1 {
	
	public static void main(String[] args) {
		C08_Employee employee = new C08_Employee();
		employee.setFirst_name("Harish");
		employee.setLast_name("Ravichandran");
		employee.setEmail("harishravichandran1995@gmail.com");
		employee.setSkills(Arrays.asList("Java","Selenium"));
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
	}

}
