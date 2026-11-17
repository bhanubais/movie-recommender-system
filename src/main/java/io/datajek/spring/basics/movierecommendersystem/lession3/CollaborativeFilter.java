package io.datajek.spring.basics.movierecommendersystem.lession3;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
