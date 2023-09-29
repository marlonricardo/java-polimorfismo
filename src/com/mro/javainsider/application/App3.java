package com.mro.javainsider.application;

import com.mro.javainsider.pet.Dog;
import com.mro.javainsider.model.Pet;

public class App3 {
    public static void main(String[] args)  throws Exception{
        Dog dog = new Dog();
        dog.feed();
        dog.sit();

        System.out.println();

        Pet p = new Dog();
        p.feed();

        //casting explicito, tomar cuidado pois pode esta fazendo casting explicito
        // para um tipo que não está na memória, no caso, Fish f = (Fish) p;

        if(p instanceof Dog){
            Dog d = (Dog) p;
            d.sit();
        }else{
            System.out.println("O tipo não é um dog!");
        }

    }
}
