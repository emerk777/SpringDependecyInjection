/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.Controller;

import com.example.SpringDependencyInjection.Services.GreetingService;

/**
 *
 * @author emer
 */
public class PropertyInjectedController {
    
    public GreetingService greetingService;
    
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    
}
