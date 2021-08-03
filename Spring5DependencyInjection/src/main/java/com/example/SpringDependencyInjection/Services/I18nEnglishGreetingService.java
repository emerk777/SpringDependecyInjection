/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringDependencyInjection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author emer
 */
@Profile("EN")
@Service("I18nGreeting")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
    
}
