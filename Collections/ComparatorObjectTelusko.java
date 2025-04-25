package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorObjectTelusko {
    public static void main(String [] args){
        class Student {
            int marks;
            String name;


            public Student(int marks, String name) {
                this.marks = marks;
                this.name = name;

            }

            public String toString() {
                return "Marks are : "+ marks + "; Name is : " + name;
            }
        }

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(67,"Yogesh"));
        studs.add(new Student(56,"Rajesh"));
        studs.add(new Student(83,"Rajesh"));
        studs.add(new Student(92,"Sandesh"));

        System.out.println(studs); //[Marks are : 67; Name is : Yogesh, Marks are : 56; Name is : Rajesh, Marks are : 83; Name is : Rajesh, Marks are : 92; Name is : Sandesh]
//using compare() method
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.marks> s2.marks)
                {
                    return 1;
                }
                    else
                        return  -1;
            }
        };

        Collections.sort(studs,studentComparator);
        System.out.println(studs); //[Marks are : 56; Name is : Rajesh, Marks are : 67; Name is : Yogesh, Marks are : 83; Name is : Rajesh, Marks are : 92; Name is : Sandesh]
        //using streams
        Comparator<Student> studentComparator1 = ( s1, s2) ->  s1.marks > s2.marks? 1: -1;

        Collections.sort(studs,studentComparator1);
        System.out.println(studs); //[Marks are : 56; Name is : Rajesh, Marks are : 67; Name is : Yogesh, Marks are : 83; Name is : Rajesh, Marks are : 92; Name is : Sandesh]
    }

}
