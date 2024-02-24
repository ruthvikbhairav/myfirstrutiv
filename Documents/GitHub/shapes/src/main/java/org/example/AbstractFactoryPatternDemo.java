package org.example;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of shape Rectangle
        shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of shape Rectangle
        shape1.draw();
        //get an object of shape Square
        shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of shape Square
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of shape Rectangle
        shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of shape Rectangle
        shape3.draw();
        //get an object of shape Square
        shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of shape Square
        shape4.draw();

    }
}