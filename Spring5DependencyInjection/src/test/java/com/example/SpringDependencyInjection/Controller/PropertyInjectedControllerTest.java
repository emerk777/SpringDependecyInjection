/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.Controller;

import com.example.SpringDependencyInjection.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author emer
 */
public class PropertyInjectedControllerTest {
    
    PropertyInjectedController controller;

    @BeforeEach
    public void setUp() {
        
       controller = new PropertyInjectedController();
       controller.greetingService = new ConstructorGreetingService();
       }

    @Test
    public void testGetGreeting() {
            System.out.println(controller.getGreeting());
    }
    
}
