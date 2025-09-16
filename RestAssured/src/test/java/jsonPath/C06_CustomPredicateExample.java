package jsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;


public class C06_CustomPredicateExample {
	
	static File jsonFile = new File("src/test/resources/book.json");
	public static void filterAPIPredicateExample() throws IOException {
		Predicate movieGenre = new Predicate() {
			@Override
			public boolean apply(PredicateContext ctx) {
			    // TODO Auto-generated method stub
			    boolean predicate = ctx.item(Map.class).containsKey("title");
			    return predicate;
			}};
			List<Map<String,Object>> object = JsonPath.
					parse(jsonFile).
					read("$.movies[?]",List.class, movieGenre);
			System.out.println(object);
	}
	//same using Lambda
	public static void usingLambda() throws IOException {
		Predicate usiLambda = ctx->ctx.item(Map.class).containsKey("releaseYear");
		List<Map<String,Object>> object = JsonPath.
				parse(jsonFile).
				read("$.movies[?(@.releaseYear > 2010 && @.genre == 'Adventure')]",List.class, usiLambda);
		System.out.println(object);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		filterAPIPredicateExample();
		usingLambda();
	}
}

