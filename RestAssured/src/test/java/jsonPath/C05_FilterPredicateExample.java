package jsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import static  com.jayway.jsonpath.Criteria.*;
import static com.jayway.jsonpath.Filter.filter;

public class C05_FilterPredicateExample {
	
	static File jsonFile = new File("src/test/resources/book.json");

	//print movie tile names releaased after 2010
	public static void filterAPIpredicateExample() throws IOException {
		Filter pricelessthan = Filter.
				filter(
				Criteria
				.where("releaseYear")
				.lt(2010));
		List<Object> titleName = JsonPath.parse(jsonFile).read("$.movies[?].title",pricelessthan);
		System.out.println("===========MovieName==========");
		for (Object names : titleName) {
			System.out.println(names);
		}
	}
	
	//print movie name before 2000 and is equal to Crime
	public static void crimeMovie() throws IOException {
		Filter crimeMoviein90s = Filter.filter(
				where("releaseYear")
				.lte(2000)
				.and("genre")
				.is("Crime"));
		System.out.println("===========Crime Movie Name==========");
		List<Object> titleName = JsonPath.parse(jsonFile).read("$.movies[?].title",crimeMoviein90s);
		for (Object names : titleName) {
			System.out.println(names);
		}
				
	}
	
	//Same as crimeMovie but using MAP
	//print movie name before 2000 and is equal to Crime
	//using static import
		public static void crimeMovieusingMAP() throws IOException {
			Filter crimeMoviein90s = filter(
					Criteria
					.where("releaseYear")
					.lte(2000)
					.and("genre")
					.is("Crime"));
			System.out.println("===========Available format==========");
			List<Map<String,Object>> titleName = JsonPath.parse(jsonFile).read("$.movies[?]",crimeMoviein90s);
			System.out.println(titleName.get(0).get("availableFormats"));
					
		}
	
	
	
	
	public static void main(String[] args) throws IOException {
		filterAPIpredicateExample();
		crimeMovie();
		crimeMovieusingMAP();
	}
}
