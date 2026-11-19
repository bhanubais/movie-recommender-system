package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private Filter filter;

    @Autowired
    RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
        IO.println("Constructor invoked...");
    }

    public String[] recommendMovies(String movie) {
        IO.println("Name of the filter is use: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
