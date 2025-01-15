package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "ㄴ아아니아이ㅣ이ㅏ이니이나이이나ㅏ이ssdsdsdsssdsd";
    }
}