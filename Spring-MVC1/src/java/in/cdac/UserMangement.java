/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac;

import in.cdac.db.DBOperations;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author CDAC
 */
@Controller
public class UserMangement {
    
    @Autowired
    DBOperations dbops;
    
    
    @RequestMapping("/userlogin")
    public String showLoginPage(){
        return "login";
    }
    
    @RequestMapping(value="/userauthentication", method = RequestMethod.POST)
    public String verifyUser(HttpServletRequest req, Model m){
        String username = req.getParameter("username");
        String pwd = req.getParameter("password");
        
//        if(username.equals("abc")){ //verified with DB
//            m.addAttribute("msg", "Hi.."+username);
//            return "welcome";
//        }       

        if(dbops.verifyUserDetails(username, pwd)){
            m.addAttribute("msg", "Hi.."+username);
            return "welcome";
        }
        m.addAttribute("msg", "Invalid User Details");
        return "invaliddetails";
    }
    
}
