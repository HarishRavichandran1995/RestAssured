package jsonPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.InvalidJsonException;
import com.jayway.jsonpath.JsonPath;

public class C01_ReadJson2 {
	
	public static void readJson() throws InvalidJsonException, IOException {
		InputStream file = new  FileInputStream("src/test/resources/dc.json");
		Object parsedFile = Configuration.
		defaultConfiguration().
		jsonProvider().
		parse(file.readAllBytes());
		List<Object> age = JsonPath.read(parsedFile,"$..age");
		System.out.println("Printing age......");
		for (Object object : age) {
			System.out.println( object);
		}
	}
	public static void main(String[] args) throws InvalidJsonException, IOException {
		// TODO Auto-generated method stub
	readJson();
	}
}
