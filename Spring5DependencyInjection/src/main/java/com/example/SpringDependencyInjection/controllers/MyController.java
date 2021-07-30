/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.controllers;

import org.springframework.stereotype.Controller;

/**
 *
 * @author emer
 */
@Controller
public class MyController {
    
    public String sayHello(){
        System.out.println("Hello World!!!");
        
        return "Hi Folks!!!";
    }
    
}
