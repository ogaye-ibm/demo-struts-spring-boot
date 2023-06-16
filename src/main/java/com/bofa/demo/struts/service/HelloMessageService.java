package com.bofa.demo.struts.service;

import org.springframework.stereotype.Component;

@Component
public class HelloMessageService {

    public String getLanguage(String language) {

        System.out.println("   ***** HelloMessageService getLanguage() invoked in " + language);

        if (language.equalsIgnoreCase("english")){
            return "Greeting Struts and Spring Boot fan!";
        }
        else if (language.equalsIgnoreCase("french")){
            return "Bonjour, fan de Struts et de Spring Boot !";
        }
        else{
            return "Please choose one from this list: English|French";
        }
    }

}
