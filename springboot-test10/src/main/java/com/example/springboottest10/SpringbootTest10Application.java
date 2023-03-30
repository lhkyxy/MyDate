package com.example.springboottest10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.mapper")
public class SpringbootTest10Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest10Application.class, args);
    }

}
