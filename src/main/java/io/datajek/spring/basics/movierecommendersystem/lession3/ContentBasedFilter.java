package io.datajek.spring.basics.movierecommendersystem.lession3;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
