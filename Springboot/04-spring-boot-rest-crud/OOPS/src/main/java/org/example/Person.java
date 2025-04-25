package org.example;

public class Person {
    int age;
    String name;
    String gender;

    public Person(int age, String name, String gender) {
    }

    public void checkEligibility(int age,String name,String gender) throws CustomCheckedException{
        this.name=name;
        System.out.println("name is "+name);

        if (age<0){
            throw new CustomCheckedException("Age should be positive" + age);
        }
        if (age<18){
            throw new CustomCheckedException("Age must be greater than 18  :" + age);
        }

        this.gender=gender;
        System.out.println("gender is "+gender);
    }

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Eligible to vote");
    }
}
