package com.prototypePattern;

/**
 * Created by mithun on 29/03/18.
 */
    public class Square extends Shape {

        public Square(){
            type = "Square";
        }

        @Override
        public void draw() {
            System.out.println("Inside Square::draw() method.");
        }
    }

