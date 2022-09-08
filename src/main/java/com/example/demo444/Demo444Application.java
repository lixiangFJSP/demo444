package com.example.demo444;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo444.mapper")//扫描接口并进行调用
public class Demo444Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo444Application.class, args);
    }

}
