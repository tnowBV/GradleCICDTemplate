package com.bonvoyal.templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application.
 *
 * <p>This class bootstraps the application using {@link SpringApplication}.
 * It also contains a simple test output statement for demonstration.</p>
 *
 * @author YourName
 */
@SpringBootApplication
public class GradleApplication {

    /**
     * The main method which serves as the entry point of the application.
     *
     * @param args Command-line arguments passed during application startup.
     */
    public static void main(final String[] args) {
        //Test failed checkstyle:
        String hi = "Hello World!";
        System.out.println(hi);

        SpringApplication.run(GradleApplication.class, args);
    }

}
