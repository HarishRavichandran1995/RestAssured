package C05_GettersSettersSerialization.copy;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuperHeroMoviesAndTVSeries {

    private String category;
    private List<String> acceptedFranchises;
    private List<String> genres;
    private List<Movies> movies;
    private List<TVSeries> tvSeries;
    private List<OtherDetails> otherDetails;

   
}
