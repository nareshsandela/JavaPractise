package org.example;

public class Employee {
        //declaring the variables as private so that restricting the direct access
        // The fields (id, name, salary) are private, so they can't be accessed directly from outside the class

        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, int salary) {
        }

        public Employee() {

        }

    public Employee(String name, int id) {
            this.name = name;
            this.id = id;
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

    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    public double calculateSalary() {
        return 30000.00; // base salary
    }
    }

