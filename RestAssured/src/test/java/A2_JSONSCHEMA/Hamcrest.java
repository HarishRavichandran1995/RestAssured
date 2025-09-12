package A2_JSONSCHEMA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class Hamcrest {
	
	@Test
	public void hamcrestExample() throws IOException {
		File file = new File("src/test/resources/readJson.json");
		String fileToString = FileUtils.readFileToString(file,"UTF-8");
		InputStream inputStream = new FileInputStream("src/test/resources/schema.json");
		MatcherAssert.assertThat(fileToString,
				JsonSchemaValidator.matchesJsonSchema(inputStream));
	}

}
