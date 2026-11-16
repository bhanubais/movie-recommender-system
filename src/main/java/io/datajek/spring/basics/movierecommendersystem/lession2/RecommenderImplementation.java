package io.datajek.spring.basics.movierecommendersystem.lession2;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie) {
        //ContentBasedFilter filter = new ContentBasedFilter();
        CollaborativeFilter filter = new CollaborativeFilter();
        return filter.getRecommendations(movie);
    }
}
