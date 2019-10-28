package com.designPatterns.prototypePattern;

/**
 * Created by mithun on 29/03/18.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}