package com.jwtauthentication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @PostMapping("/token")
    public ResponseEntity<?> generateToken() {

    }
}
