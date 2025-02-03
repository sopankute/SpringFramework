package com.authorization.jwtauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/welcome")
    public String welcome(){

        String text = "this is private page\n";
        text += "This page isn't allowed to unauthenticated users";
        return text;
    }
}
