package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    @Qualifier("CBF")
    private Filter filter;

    public String[] recommendMovies(String movie) {
        IO.println("Name of the filter is use: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
