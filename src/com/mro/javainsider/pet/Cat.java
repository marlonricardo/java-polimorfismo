package com.mro.javainsider.pet;

import com.mro.javainsider.model.Pet;

public class Cat extends Pet {
    @Override
    public void feed() {
        System.out.println("Cat is eating...");
    }
}
