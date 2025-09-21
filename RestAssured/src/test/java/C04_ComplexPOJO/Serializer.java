package C04_ComplexPOJO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {
    public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
        SuperHeroMoviesAndTVSeries heroMoviesAndTVSeries = new SuperHeroMoviesAndTVSeries();

        heroMoviesAndTVSeries.setCategory("Super Hero Movies & TV Series");

        List<String> acceptedFranchises = new ArrayList<>();
        acceptedFranchises.add("Marvel");
        acceptedFranchises.add("DC");
        heroMoviesAndTVSeries.setAcceptedFranchises(acceptedFranchises);

        List<String> genres = new ArrayList<>();
        genres.add("Action");
        genres.add("Adventure");
        genres.add("Heroic");
        genres.add("Dark");
        genres.add("Funny");
        heroMoviesAndTVSeries.setGenres(genres);

        List<Movies> allMovies = new ArrayList<>();

        Movies batman = new Movies();
        batman.setTitle("Batman: The Dark Knight");
        batman.setYear(2008);
        batman.setCast(List.of("Christian Bale", "Heath Ledger"));
        allMovies.add(batman);

        Movies jl = new Movies();
        jl.setTitle("Justice League: Snyder Cut");
        jl.setYear(2028);
        jl.setCast(List.of("Henry Cavill", "Gal Gadot"));
        allMovies.add(jl);

        Movies avengersUltron = new Movies();
        avengersUltron.setTitle("Avengers: Age of Ultron");
        avengersUltron.setYear(2015);
        avengersUltron.setCast(List.of("Robert Downey Jr.", "Chris Evans"));
        allMovies.add(avengersUltron);

        Movies inception = new Movies();
        inception.setTitle("Inception");
        inception.setYear(2010);
        inception.setCast(List.of("Leonardo DiCaprio", "Joseph Gordon-Levitt"));
        allMovies.add(inception);

        heroMoviesAndTVSeries.setMovies(allMovies);

        List<TVSeries> allTVSeries = new ArrayList<>();

        TVSeries strangerThings = new TVSeries();
        strangerThings.setTitle("Stranger Things");
        strangerThings.setYear(2016);
        allTVSeries.add(strangerThings);

        TVSeries breakingBad = new TVSeries();
        breakingBad.setTitle("Breaking Bad");
        breakingBad.setYear(2008);
        allTVSeries.add(breakingBad);

        TVSeries gameOfThrones = new TVSeries();
        gameOfThrones.setTitle("Game of Thrones");
        gameOfThrones.setYear(2011);
        allTVSeries.add(gameOfThrones);

        TVSeries loki = new TVSeries();
        loki.setTitle("Loki");
        loki.setYear(2021);
        allTVSeries.add(loki);

        heroMoviesAndTVSeries.setTvSeries(allTVSeries);

        OtherDetails indiaDetails = new OtherDetails();
        indiaDetails.setCountry("India");
        indiaDetails.setLanguage("Tamil");

        List<OtherDetails> otherDetailsList = new ArrayList<>();
        otherDetailsList.add(indiaDetails);

        heroMoviesAndTVSeries.setOtherDetails(otherDetailsList);
        heroMoviesAndTVSeries.setMovies(allMovies);
        heroMoviesAndTVSeries.setTvSeries(allTVSeries);
        
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("complex.json");
        mapper.writerWithDefaultPrettyPrinter().writeValue(file,heroMoviesAndTVSeries);
        
        
        
    }
}