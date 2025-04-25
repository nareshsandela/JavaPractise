package org.example;

public class MethodOverloadingExample {
    static class Calculator{
        public int add(int a,int b){
            return a+b;
        }

        public double add(int a,double b){
            return a+b;
        }

        public double add(double a,double b){
            return a+b;
        }

        public int add(int a,int b,int c){
            return a+b+c;
        }
    }
    public static void main(String[] args) {
        Calculator print = new Calculator();
        System.out.println(print.add(1,1));
        System.out.println(print.add(1.0,2.0));
        System.out.println(print.add(2.0,3));
        System.out.println(print.add(1,1,1));

    }

}
