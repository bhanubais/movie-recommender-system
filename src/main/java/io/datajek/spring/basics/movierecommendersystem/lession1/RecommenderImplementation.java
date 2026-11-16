package io.datajek.spring.basics.movierecommendersystem.lession1;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();
        return filter.getRecommendation(movie);
    }
}
