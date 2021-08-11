package com.hsrd.ems.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("test")
    public String test(){
        System.out.println("test method invoke");
        return "test method invoke";
    }
}
