package Collections;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName,String lastName){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String toString(){
        return "first name is: " + firstName + "last name is :" + lastName;
    }

}
