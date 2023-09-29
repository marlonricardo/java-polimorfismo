package com.mro.javainsider.application;

import com.mro.javainsider.gerenator.Generator;
import com.mro.javainsider.gerenator.Person;
import com.mro.javainsider.gerenator.SequenceGenerator;

public class App2 {
    public static void main(String[] args) {

        Generator generator = new SequenceGenerator();
//        System.out.println(generator.next());
//        System.out.println(generator.next());
//        System.out.println(generator.next());


        Person p1 = new Person(generator);
        System.out.println(p1.getId());

        Person p2 = new Person(generator);
        System.out.println(p2.getId());

        Person p3 = new Person(generator);
        System.out.println(p3.getId());

    }
}
