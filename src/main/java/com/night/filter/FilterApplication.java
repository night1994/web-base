package com.night.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.night.filter.*"})
public class FilterApplication {

    public static void main(String[] args) {

        SpringApplication.run(FilterApplication.class, args);
    }

}
