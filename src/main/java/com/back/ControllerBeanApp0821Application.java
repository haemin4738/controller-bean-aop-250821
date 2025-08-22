package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ControllerBeanApp0821Application {

    public static void main(String[] args) {
        SpringApplication.run(ControllerBeanApp0821Application.class, args);
    }

}