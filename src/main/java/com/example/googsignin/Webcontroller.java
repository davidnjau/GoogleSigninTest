package com.example.googsignin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Webcontroller {

    @RequestMapping("/login")
    public String googleLogin() {
        return "login2";
    }

}
