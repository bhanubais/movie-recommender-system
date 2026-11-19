package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter contentBasedFilter;

    public String[] recommendMovies(String movie) {
        IO.println("Name of the filter is use: " + contentBasedFilter + "\n");
        return contentBasedFilter.getRecommendations(movie);
    }
}
