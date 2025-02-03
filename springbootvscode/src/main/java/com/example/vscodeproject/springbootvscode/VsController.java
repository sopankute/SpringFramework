package com.example.vscodeproject.springbootvscode;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



// @Controller
@RestController
public class VsController {

    // @RequestMapping(value = "/test", method=RequestMethod.GET) 
    // @ResponseBody 
    @GetMapping("/test")
    public String handler(){
        return "This is my first spring boot VS code application.";
    }
}
