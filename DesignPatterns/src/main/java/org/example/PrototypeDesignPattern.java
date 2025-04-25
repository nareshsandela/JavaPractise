package org.example;

import javax.crypto.Cipher;

public class PrototypeDesignPattern {
    public static void main(String args[]){

        ShapeInstanceFactory factory = new ShapeInstanceFactory();
        Shape cubeObj = factory.getShapeInstance("Cube");
        cubeObj.computeArea();

        Shape squareObj = factory.getShapeInstance("Square");
        squareObj.computeArea();
    }
}
