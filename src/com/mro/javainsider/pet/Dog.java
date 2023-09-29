package com.mro.javainsider.pet;

import com.mro.javainsider.model.Pet;

public class Dog extends Pet {
    @Override
    public void feed() {
        System.out.println("Dog is eating...");
    }
    public void sit(){
        System.out.println("Dog is sitting...");
    }

}
