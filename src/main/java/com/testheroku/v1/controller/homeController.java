package com.testheroku.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class homeController {

    @GetMapping(value = "home")
    public String home() {

        return "home";

    }

}
