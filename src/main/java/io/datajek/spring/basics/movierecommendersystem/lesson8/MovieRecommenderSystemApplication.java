package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf3 = appContext.getBean(ContentBasedFilter.class);

        IO.println(cbf1);
        IO.println(cbf2);
        IO.println(cbf3);

        IO.println("----");

        CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);

        IO.println(cf1);
        IO.println(cf2);
        IO.println(cf3);


    }
}

