package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    public ContentBasedFilter() {
        IO.println("ContentBasedFilter Bean created");
    }

    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
