package C06_SerilizationDeserilizationUnderstanding;

import java.util.List;

public class C08_Employee {
	
	private String first_name;
	private String last_name;
	private String email;
	private List<String> skills;
	
	public String getFirst_name() {
		System.out.println("GETTER FN");
		return first_name;	
	}
	
	public String getLast_name() {
		System.out.println("GETTER LN");
		return last_name;	
	}
	
	public String getEmail() {
		System.out.println("GETTER EM");
		return email;	
	}
	
	public List<String> getSkills() {
		System.out.println("GETTER SKILL");
		return skills;	
	}

	// Setters (must accept parameters)
	public void setFirst_name(String first_name) {
		System.out.println("SETTER FN");
		this.first_name = first_name;
	}
	
	public void setLast_name(String last_name) {
		System.out.println("SETTER LN");
		this.last_name = last_name;
	}
	
	public void setEmail(String email) {
		System.out.println("SETTER EM");
		this.email = email;
	}
	
	public void setSkills(List<String> skills) {
		System.out.println("SETTER SKILL");
		this.skills = skills;
	}

}
