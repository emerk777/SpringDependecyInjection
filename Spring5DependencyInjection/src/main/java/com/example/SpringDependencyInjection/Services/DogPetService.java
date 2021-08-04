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
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService{
    
    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
    
}
