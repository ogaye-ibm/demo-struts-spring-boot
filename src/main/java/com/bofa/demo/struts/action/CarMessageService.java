package com.bofa.demo.struts.action;
import org.springframework.stereotype.Component;

@Component
public class CarMessageService {

    public String getMessage(String carName) {

        System.out.println("   ***** HelloMessageBuilder getMessage() invoked in " + carName);

        if (carName.equalsIgnoreCase("english")){
            return "Greeting Struts and Spring Boot fan!";
        }
        else if (carName.equalsIgnoreCase("french")){
            return "Bonjour, fan de Struts et de Spring Boot !";
        }
        else{
            return "Please choose one from this list: English|French";
        }
    }

}
