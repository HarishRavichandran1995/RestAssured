package non_bdd_style;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class B3_Serilization {
	@Test
	public void serilization() {
		Map<String, Object> jsonBody = new HashMap<String, Object>();
		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("Selenium");
		jsonBody.put("FirstName", "Harish");
		jsonBody.put("LastName", "Ravichandran");
		jsonBody.put("Email","xxxchnadran@gmail.com");
		jsonBody.put("Skils",skills);
		System.out.println(jsonBody);		
		}
}
