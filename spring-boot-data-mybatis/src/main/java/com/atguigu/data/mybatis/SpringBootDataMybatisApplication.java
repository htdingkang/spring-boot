package com.atguigu.data.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value = "com.atguigu.data.mybatis.mapper")
@SpringBootApplication
public class SpringBootDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataMybatisApplication.class, args);
    }

}
