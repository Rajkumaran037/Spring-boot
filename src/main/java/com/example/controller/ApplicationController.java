package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/home")
    public String home() {
        return "Welcome Spring is here!";
    }

    @GetMapping("/home")
    public String getUser() {
        return "Welcome Spring is here!";
    }
}
