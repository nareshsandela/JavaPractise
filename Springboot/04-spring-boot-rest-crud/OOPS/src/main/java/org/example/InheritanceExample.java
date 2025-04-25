
package org.example;

public class InheritanceExample {
   public static class Manager extends Employee {
        private double bonus;

        public Manager(String name, int id, double bonus) {
            super(name, id); // calling parent class constructor
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary(){
           return super.calculateSalary()+bonus;
        }

        public void manageTeam() {
            System.out.println("Manager is managing the team.");
        }
    }

    public static void main(String args[]){
        Manager obj = new Manager("Naresh", 101, 10000.0);

        //accessing parent class method
        obj.displayInfo();

        //overrding parent class method
       System.out.println("Total salary is :" + obj.calculateSalary());


        // Subclass specific method
        obj.manageTeam();
    }

}
