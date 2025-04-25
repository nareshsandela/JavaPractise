package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    class Students implements Comparable<Students> {
        public int marks;
        public String name;


        public Students(int marks, String name) {
            this.marks = marks;
            this.name = name;

        }

        public String toString() {
            return "Marks are : " + marks + "; Name is : " + name;
        }

        @Override
        public int compareTo(Students that) {
            if (this.marks < that.marks) {
                return 1;
            } else
                return -1;
        }
    }

public class ComparableTelusko {
    public static void main(String [] args){

        List<Students> studs=new ArrayList<>();
        studs.add(new Students(67,"Yogesh"));
        studs.add(new Students(56,"Rajesh"));
        studs.add(new Students(83,"Rajesh"));
        studs.add(new Students(92,"Sandesh"));

        System.out.println(studs); //[Marks are : 67; Name is : Yogesh, Marks are : 56; Name is : Rajesh, Marks are : 83; Name is : Rajesh, Marks are : 92; Name is : Sandesh]

        Collections.sort(studs);
        System.out.println(studs); //[Marks are : 92; Name is : Sandesh, Marks are : 83; Name is : Rajesh, Marks are : 67; Name is : Yogesh, Marks are : 56; Name is : Rajesh]
    }
}
