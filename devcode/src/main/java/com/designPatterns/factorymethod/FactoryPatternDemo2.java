package com.designPatterns.factorymethod;

/**
 * Created by mithun on 25/04/18.
 */
public class FactoryPatternDemo2 {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Geometry g=new Geometry();
        g.shapeDraw(shape1);

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        g.shapeDraw(shape2);

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        g.shapeDraw(shape3);
    }

}
