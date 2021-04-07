package com.atguigu.config.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@Value("${person.lastName}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello "+name;
    }

}
