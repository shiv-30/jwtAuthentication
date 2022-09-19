package com.jwtauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/welcome")
    public String welcome() {
        String text="this is private message";
        text += "this page is not allowed to unauthorized author";
        return text;
    }
}
