package org.example;

public class MethodOverridingExample {
    public static class CalculatorClass {
        public double calculate(double a, double b) {
            System.out.println("Base Calculator: Adding two numbers");
            return a + b;
        }
    }

    // Subclass 1 - Basic Calculator
    static class BasicCalculator extends CalculatorClass {
        @Override
        public double calculate(double a, double b) {
            System.out.println("Basic Calculator: Performing Addition");
            return a + b;
        }
    }

    // Subclass 2 - Scientific Calculators
    static class ScientificCalculator extends CalculatorClass {
        @Override
        public double calculate(double a, double b) {
            System.out.println("Scientific Calculator: Performing Power Calculation");
            return Math.pow(a, b); // a^b
        }

        public static void main(String[] args) {
            CalculatorClass calc; // Parent reference

            calc = new BasicCalculator();
            System.out.println("Result: " + calc.calculate(10, 5)); // Calls BasicCalculator

            calc = new ScientificCalculator();
            System.out.println("Result: " + calc.calculate(2, 3)); // Calls ScientificCalculator

        }
    }
}
