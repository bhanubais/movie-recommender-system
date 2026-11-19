package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        IO.println("Constructor injection in RecommenderImplementation2 class");

        RecommenderImplementation2 recommender = appContext.getBean(RecommenderImplementation2.class);

        String[] result = recommender.recommendMovies("Finding Dory");
        IO.println(Arrays.toString(result));
    }
}

