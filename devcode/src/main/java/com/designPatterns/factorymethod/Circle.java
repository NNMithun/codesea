package com.designPatterns.factorymethod;

/**
 * Created by mithun on 25/04/18.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
