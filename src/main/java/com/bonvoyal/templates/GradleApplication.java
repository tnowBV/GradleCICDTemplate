package com.bonvoyal.templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleApplication {

    public static void main(String[] args) {
        //Test failed checkstyle:
        String HelloWorld = "Hello World!";
        System.out.println(HelloWorld);

        SpringApplication.run(GradleApplication.class, args);
    }

}
