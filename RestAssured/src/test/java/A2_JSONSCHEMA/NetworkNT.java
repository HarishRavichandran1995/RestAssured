package A2_JSONSCHEMA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class NetworkNT {
	
	@Test
	public void usingnetworkNT() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonSchemaFactory factory =JsonSchemaFactory.getInstance(VersionFlag.V7);
		 // JSON data to validate
		File file = new File("src/test/resources/readJson.json");
		JsonNode jsonNode = mapper.readTree(file);
		 // Load schema correctly
		InputStream  inputSchema = new FileInputStream("src/test/resources/schema.json");
		JsonSchema schema = factory.getSchema(inputSchema);
		Set<ValidationMessage> result = schema.validate(jsonNode);
		if (result.isEmpty()) {
			System.out.println("No validation error");
		}else {
		
		for (ValidationMessage validationMessage : result) {
			System.out.println(validationMessage);
		}
		}
	}

}
