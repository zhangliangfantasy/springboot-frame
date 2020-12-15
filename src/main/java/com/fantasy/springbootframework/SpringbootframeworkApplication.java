package com.fantasy.springbootframework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.fantasy.springbootframework.**.mapper*"})
@SpringBootApplication
public class SpringbootframeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootframeworkApplication.class, args);
    }

}
