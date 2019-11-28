package com.example.skaffoldtestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {

    @GetMapping("/message/v1")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Welcome to Skaffold! It's a complicated road to follow but we finally got here!");
    }
}
