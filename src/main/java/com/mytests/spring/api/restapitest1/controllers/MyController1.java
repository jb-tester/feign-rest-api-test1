package com.mytests.spring.api.restapitest1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class MyController1 {

    @GetMapping("/")
    public String getHome(){
        return "this is the simple test";
    }

    @GetMapping("/{g_name}")
    public String getHello(@PathVariable String g_name){

        return "hello "+ g_name;
    }
}
