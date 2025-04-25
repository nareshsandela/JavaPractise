package Collections;
import java.util.*;
class Employee implements Comparable<Employee> {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age is :" + age + "name is :" + name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.age - other.age;
    }
}

    public class ComparableDemo {


        public static void main(String[] args) {
            List<Employee> employee = new ArrayList<>();
            employee.add(new Employee(24, "Sekhar"));
            employee.add(new Employee(26, "Rajesh"));
            employee.add(new Employee(21, "Rohit"));
            employee.add(new Employee(28, "Aman"));

            System.out.println(employee);
            Collections.sort(employee);

            System.out.println(employee);

        }



}


