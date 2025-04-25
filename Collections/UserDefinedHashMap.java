package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class UserDefinedHashMap {
    public static void main(String [] args){
        Map<Integer, Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,new Student("Kishore", "p"));
        studentMap.put(2,new Student("Rahul","h"));
        studentMap.put(3,new Student("Harshit","s"));

        System.out.println(studentMap);
        //{1=first name is: Kishorelast name is :p, 2=first name is: Rahullast name is :h, 3=first name is: Harshitlast name is :s}
        System.out.println(studentMap.values());
        //[first name is: Kishorelast name is :p, first name is: Rahullast name is :h, first name is: Harshitlast name is :s]
    }

}
