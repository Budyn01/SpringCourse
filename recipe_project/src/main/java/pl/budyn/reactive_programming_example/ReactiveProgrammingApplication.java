package pl.budyn.reactive_programming_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

/**
 * Created by Budyn on 31.03.2018.
 */

@SpringBootApplication
@PropertySource("classpath:reactive-application.properties")
public class ReactiveProgrammingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveProgrammingApplication.class, args);
    }
}
