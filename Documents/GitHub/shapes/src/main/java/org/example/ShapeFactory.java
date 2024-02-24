package org.example;
    public class ShapeFactory extends AbstractFactory {
        @Override
        public shape getShape(String shapeType){
            if(shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }
            return null;
        }
    }

