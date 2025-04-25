package org.example;

public abstract class AbstractionUsingAbstractClass{

    public abstract static class VehicleClass {


        private String model;

        public VehicleClass(String model){
            this.model=model;
        }

        public String getModel() {
            return model;
        }

        // Abstract method - must be implemented by subclasses
        public abstract void startEngine();

        //concrete method
        public void fuelCapacity(){
            System.out.println(model + " has 50L fuel capacity.");
        }
    }


    public void main(String[] args) {
        VehicleClass myCar = new Car("Honda City");

        // Abstraction in action
        myCar.startEngine();     // Hides internal engine logic
        myCar.fuelCapacity();    // Concrete method from abstract class
    }
    class Car extends VehicleClass {
        public Car(String model) {
            super(model);
        }

        public void startEngine(){
            System.out.println(getModel() + "'s engine starts with a key.");
        }
    }
}
