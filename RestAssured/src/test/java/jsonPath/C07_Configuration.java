package jsonPath;

import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class C07_Configuration {
	
	static String json = "[\r\n"
			+ "{\r\n"
			+ "  \"name\" : \"john\",\r\n"
			+ "  \"gender\" : \"male\"\r\n"
			+ "},\r\n"
			+ "{\r\n"
			+ "  \"name\" : \"ben\"\r\n"
			+ "}\r\n"
			+ "]";
	
	public static void printingJSON() {
		Configuration configuration = Configuration.defaultConfiguration();
		List<Map<String,Object>> jsonMsg = JsonPath
		.using(configuration)
		.parse(json)
		.read("$.[*]");
		System.out.println(jsonMsg);
	}
	
	
	public static void pathNotFoundExceptionExample() {
		Configuration configuration = Configuration.defaultConfiguration();
		//Configuration options = configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		List<Object> jsonMsg = JsonPath
				.using(configuration)
				.parse(json)
				.read("$.[1].gender");
				System.out.println(jsonMsg);	
	}
	
	//Path not found exception
	public static void defaultPathLeafToNullExample() {
		Configuration configuration = Configuration.defaultConfiguration();
		Configuration options = configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		List<Object> jsonMsg = JsonPath
				.using(options)
				.parse(json)
				.read("$.[1].gender");
				System.out.println(jsonMsg);	
	}
	
	// ClassCastException
	public static void alwaysreturnListExample() {
		Configuration configuration = Configuration.defaultConfiguration();
		Configuration options = configuration.addOptions(Option.ALWAYS_RETURN_LIST);
		List<Object> name = JsonPath
				.using(options)
				.parse(json)
				.read("$.[1].name");
				System.out.println(name);	
	}
	
	public static void suppressExceptionExample() {
		Configuration configuration = Configuration.defaultConfiguration();
	 configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST);
	 configuration  = configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
		List<Object> name = JsonPath
				.using(configuration)
				.parse(json)
				.read("$.[1].gender");
				System.out.println(name);	
	}
	
	public static void requirepropertiesExample() {
		Configuration configuration = Configuration.defaultConfiguration();
		 configuration = configuration.addOptions(Option.REQUIRE_PROPERTIES);
			List<Object> name = JsonPath
					.using(configuration)
					.parse(json)
					.read("$.[*].gender");
					System.out.println(name);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printingJSON(); 
		 //pathNotFoundExceptionExample();
		 defaultPathLeafToNullExample();
		 alwaysreturnListExample();
		 suppressExceptionExample();
		 requirepropertiesExample();
	}

}
