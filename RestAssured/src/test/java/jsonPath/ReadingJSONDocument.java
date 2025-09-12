package jsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.jayway.jsonpath.JsonPath;

public class ReadingJSONDocument {

    public static void readJSON() throws IOException {
        File jsonPathFile = new File("src/test/resources/dc.json");

        // Read last member's secretIdentity
        List<Object> fr = JsonPath.read(jsonPathFile, "$..age");

        for (Object object : fr) {
			System.out.println(object);
		}
    }

    public static void main(String[] args) throws IOException {
        readJSON();
    }
}
