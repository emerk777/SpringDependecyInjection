/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.services;


public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld!!!";
    }
    
}
