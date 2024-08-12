package com.scm3.scm3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageController {
   @RequestMapping("/home")
    public String home(Model model){
       System.out.println("page handeler");
       model.addAttribute("name","Substring Test");
       model.addAttribute("youtube", "kaushal with learncode");
        return "home";

    }



}
