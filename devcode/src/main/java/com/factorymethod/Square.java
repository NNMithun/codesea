package com.factorymethod;

import com.prototypePattern.*;

/**
 * Created by mithun on 25/04/18.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
