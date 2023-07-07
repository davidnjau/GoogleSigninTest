package com.example.googsignin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @RequestMapping(value="google", method= RequestMethod.GET)
    public String googleSign() {
        return "Welcome to google.";
    }

}
