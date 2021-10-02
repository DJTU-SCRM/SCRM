package com.example.scrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(value = "com.**.dao")
public class ScrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScrmApplication.class, args);
    }

}
