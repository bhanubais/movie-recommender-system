package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
        IO.println("\nContentBasedFilter bean with singleton scope");
        IO.println(filter);

        Movie movie1 = filter.getMovie();
        Movie movie2 = filter.getMovie();
        Movie movie3 = filter.getMovie();

        IO.println("\nMovie bean with prototype scope");
        IO.println(movie1);
        IO.println(movie2);
        IO.println(movie3);

        IO.println("\nContentBasedFilter instances created: " + ContentBasedFilter.getInstances());
        IO.println("\nMovie instances created: " + Movie.getInstances());
    }
}

