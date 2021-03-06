/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.Controller;

import com.example.SpringDependencyInjection.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *
 * @author emer
 */
@Controller
public class PropertyInjectedController {
    
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public GreetingService greetingService;
    
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    
}
