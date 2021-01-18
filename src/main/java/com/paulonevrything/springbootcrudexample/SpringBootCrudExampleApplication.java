package com.paulonevrything.springbootcrudexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootCrudExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudExampleApplication.class, args);
    }

}
