package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {

    Filter filter;

    RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        IO.println("Name of the filter is use: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
