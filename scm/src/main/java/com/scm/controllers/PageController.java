package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
        //home
    @RequestMapping("/home")
public String home(Model model){
    model.addAttribute("name","Smart contact manger");
    model.addAttribute("work", "TO manage the contacts smartly from different platforms");
    System.out.println("Home page handler");
    return "Home";
}
    //about
    @RequestMapping("/about")
    public  String aboutPage(){
        System.out.println("About page  loading");
        return "about";
    }


    //services
     @RequestMapping("/services")
    public  String services(){
        System.out.println("Services page  loading");
        return "services";
    }


}
