package com.example.googsignin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth/")
public class GoogleSignInController {

    @RequestMapping(value="google-signin", method= RequestMethod.GET)
    public String googleSign() {
        return "Welcome to google.";
    }

}
