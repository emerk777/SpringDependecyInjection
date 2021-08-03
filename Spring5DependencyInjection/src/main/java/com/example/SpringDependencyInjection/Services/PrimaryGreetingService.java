/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author emer
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
    
}
