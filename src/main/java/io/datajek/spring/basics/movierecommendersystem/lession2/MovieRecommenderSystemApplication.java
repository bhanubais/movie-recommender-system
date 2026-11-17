package io.datajek.spring.basics.movierecommendersystem.lession2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
        String[] result = recommender.recommendMovies("Finding Dory");
        IO.println(Arrays.toString(result));
    }
}

