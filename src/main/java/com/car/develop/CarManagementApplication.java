package com.car.develop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.car.develop.mapper")
public class CarManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarManagementApplication.class, args);
    }

}
