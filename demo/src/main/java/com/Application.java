package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//MapperScan(value = {"com.spring.boot.mapper"}) 此种注解在Mapper对象不需要加@Mapper
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}
