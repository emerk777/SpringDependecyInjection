/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.Controller;

import com.example.SpringDependencyInjection.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author emer
 */
public class SetterInjectedControllerTest {
    SetterInjectedController controller;
    
    @BeforeEach
    public void setUp() {
        
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }
    /**
     * Test of getGreeting method, of class SetterInjectedController.
     */
    @Test
    public void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
    
}
