package org.example;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationExample {

    class Employee{
   //declaring the variables as private so that restricting the direct access
        // The fields (id, name, salary) are private, so they can't be accessed directly from outside the class

        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, int salary) {
        }

        public Employee() {

        }

        //The getters and setters provide controlled access and can include validation logic, which enforces rules and constraints.
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public Employee(int id,String name,Double salary){
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }


    public void main(String args[]){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Naresh",50000));
        emp.add(new Employee(102, "Rohit", 60000));
        emp.add(new Employee(103, "Amit", 55000));


    }
}
