package com.java.mobilestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class HomeController {

    @GetMapping("/getall")
    public String homePage(){
        return "HomePage";
    }
}
