package com.andreea.onlinecatalog.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Main {
    @GetMapping("/")
    public String index() {

        return "index";
    }
}
