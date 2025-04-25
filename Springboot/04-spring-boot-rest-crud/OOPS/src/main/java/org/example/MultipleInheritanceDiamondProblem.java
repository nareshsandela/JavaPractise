package org.example;



        class A {
            public void show() {
                System.out.println("A");
            }
        }

        class B extends A {
            public void show() {
                System.out.println("B");
            }
        }

        class C extends A {
            public void show() {
                System.out.println("C");
            }
        }

        //can not extend both classes using extends B,C
      public  class MultipleInheritanceDiamondProblem extends C {
            public static void main(String[] args) {
                MultipleInheritanceDiamondProblem obj = new MultipleInheritanceDiamondProblem();
                obj.show();
            }
        }