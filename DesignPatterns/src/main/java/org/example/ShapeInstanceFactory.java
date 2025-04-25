package org.example;

import java.awt.*;

public class ShapeInstanceFactory {
    public Shape getShapeInstance(String input){
        if(input.equals("Square")){
            return new Square();
        }
        else if (input.equals("Triangle")){
            return new Triangle();
        }
        else if (input.equals("Cube")){
            return new Cube();
        }
        else return null;
    }
}
