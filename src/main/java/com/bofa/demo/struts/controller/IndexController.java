package com.bofa.demo.struts.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController {

   @GetMapping("/")
    public RedirectView index(RedirectAttributes attributes) {
        System.out.println("   ***** HelloIndexController invoked ...");
        //return new RedirectView("index.html");
        return new RedirectView("index.html");
    }

}
