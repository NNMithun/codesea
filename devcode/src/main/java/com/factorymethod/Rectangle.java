package com.factorymethod;

/**
 * Created by mithun on 25/04/18.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
