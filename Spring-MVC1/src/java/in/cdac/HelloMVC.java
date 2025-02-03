/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author CDAC
 */
@Controller
public class HelloMVC {
    
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
    
    @RequestMapping("/menu")
    public String showMenu(){
        return "menu";
    }

}
