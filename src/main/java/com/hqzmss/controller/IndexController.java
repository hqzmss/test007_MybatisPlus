package com.hqzmss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping("/test")
    public String test() {
        System.out.println("中华人民共和国");
        return "3";
    }
}
