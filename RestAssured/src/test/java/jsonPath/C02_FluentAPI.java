package jsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class C02_FluentAPI {
	
	public static void usingDocumentContext() throws IOException {
		 File jsonPathFile = new File("src/test/resources/dc.json");
		 DocumentContext documentContext = JsonPath.parse(jsonPathFile);
		 List<Object> secretIdentity = documentContext.read("$..secretIdentity");
		 for (Object object2 : secretIdentity) {
			System.out.println(object2);
		}
	}
	public static void usingDefaultConfiguration() throws IOException {
		File jsonPathFile = new File("src/test/resources/dc.json");
		Configuration defaultConfiguration = Configuration.defaultConfiguration();
		List<Object> powers = JsonPath
		.using(defaultConfiguration)
		.parse(jsonPathFile)
		.read("$.members[*].powers[*]");
		for (Object object2 : powers) {
			System.out.println(object2);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		usingDocumentContext();
		usingDefaultConfiguration();
	}

}
