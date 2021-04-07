package com.atguigu.controller;

import com.atguigu.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @RequestMapping("/hi")
    public String hi(){
        return helloService.sayHellAtguigu("atguigu");
    }



    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }





}
