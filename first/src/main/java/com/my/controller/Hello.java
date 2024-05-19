package com.my.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {

    @RequestMapping("/hello")
    public String aa(){
        return "Hello, Spring boot 2";
    }
}
