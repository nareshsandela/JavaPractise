package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    class Employe {
        int age;
        String name;

        public Employe(int age, String name) {
            this.age = age;
            this.name = name;

        }

        public String toString() {
            return "age is :" + age + "name is :" + name;
        }
    }
    public class ComparatorDemo {
        public static void main(String[] args) {
            List<Employe> employeeList = new ArrayList<>();
            employeeList.add(new Employe(3, "John"));
            employeeList.add(new Employe(1, "Alice"));
            employeeList.add(new Employe(2, "Bob"));

            Comparator<Employe> nameComparator = new Comparator<Employe>() {
                @Override
                public int compare(Employe e1, Employe e2) {
                    return e1.name.compareTo(e2.name);
                }

            };
            Collections.sort(employeeList, nameComparator);
            System.out.println(employeeList);
        }
    }