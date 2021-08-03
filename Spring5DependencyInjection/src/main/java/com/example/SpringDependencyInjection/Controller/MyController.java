/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.Controller;

import com.example.SpringDependencyInjection.Services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 *
 * @author emer
 */
@Controller
public class MyController {
    
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    
    
    public String sayHello(){
//        System.out.println("Hello World!!!");
//        return "Hi Folks!";
        return greetingService.sayGreeting();
    }
    
}
