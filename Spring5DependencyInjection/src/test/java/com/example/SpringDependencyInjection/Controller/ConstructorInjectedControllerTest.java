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
public class ConstructorInjectedControllerTest {
    
    ConstructorInjectedController controller;
    
    @BeforeEach
    public void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    /**
     * Test of getGreeting method, of class ConstructorInjectedController.
     */
    @Test
    public void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
    
}
