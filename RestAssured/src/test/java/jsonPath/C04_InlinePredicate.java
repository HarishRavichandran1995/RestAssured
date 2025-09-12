package jsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class C04_InlinePredicate {
	
	public static void usingAndFunction() throws IOException {
		File jsonPathFile = new File("src/test/resources/book.json");
		List<Object> andExample = JsonPath.parse(jsonPathFile).read("$.movies[?(@.releaseYear > 30 && @.genre == 'Crime')].director");
		System.out.println("Director name");
		for (Object director : andExample) {
			System.out.println(director);
			
		}
	}
	
	public static void usingORFunction() throws IOException {
		File jsonPathFile = new File("src/test/resources/book.json");
		List<Object> andExample = JsonPath.parse(jsonPathFile).read("$.movies[?(@.releaseYear > 2040 || @.genre == 'Action')].title");
		System.out.println("Movie name");
		for (Object director : andExample) {
			System.out.println(director);
			
		}
	}
	
	public static void usingnegateFunction() throws IOException {
		File jsonPathFile = new File("src/test/resources/book.json");
		List<Object> andExample = JsonPath.parse(jsonPathFile).read("$.movies[?(!(@.releaseYear > 2040 || @.genre == 'Action'))].title");
		System.out.println("Negate - Movie name");
		for (Object director : andExample) {
			System.out.println(director);
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		usingAndFunction();
		usingORFunction();
		usingnegateFunction();
	}

}
