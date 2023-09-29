package com.mro.javainsider.application;

import com.mro.javainsider.pet.Cat;
import com.mro.javainsider.pet.Dog;
import com.mro.javainsider.pet.Fish;
import com.mro.javainsider.model.Pet;

public class App {
    public static void main(String[] args) {
        Pet au = new Dog();
        //au.feed();

        Pet miau = new Cat();
        //miau.feed();

        feedPet(au);
        feedPet(miau);

        feedPet(new Fish());
    }
    private static void feedPet(Pet p){
        p.feed();

    }
}
