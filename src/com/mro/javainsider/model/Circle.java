package com.mro.javainsider.model;

public class Circle implements Shape{

    private double r;

    public Circle(double r){
        this.r = r;
    }
    @Override
    public double surfaceArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
