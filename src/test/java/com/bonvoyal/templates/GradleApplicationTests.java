package com.bonvoyal.templates;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradleApplicationTests {

    @Test
    void contextLoads() {
        //Test failed checkstyle:
        String HelloWorld = "Hello World!";
        System.out.println(HelloWorld);
    }

}
