package org.example.String;

public class StringAndStringPool {
    public static void main (String args[]){


    //creating string literal in string pool
    // From java 7 String pool is a storage area in java heap memory, where all the other objects are created.
// Prior to Java 7 String pool was created in permgen space of heap.
    String s1 = "Java";  //str1 is a reference variable
    String s3 = "Java";

    //creating string using new operator in Heap
    String s2 = new String("Java");
    String s4 = new String("Java");

    //creating string using new operator  but creates in string pool due to intern
    String s5 = new String("Java").intern();

        String str1 = "Java";                     // In String Pool
        String str3 = "Java";                     // Same as s1 (String Pool)
        String str2 = new String("Java");         // New object in Heap
        String str4 = new String("Java");         // New object in Heap
        String str5 = new String("Java").intern();// Interned: refers to String Pool ("Java")


        System.out.println("--comparing s1--");
        System.out.println(s1 == s2); // ❌ false – s1 is in pool, s2 is in heap
        System.out.println(s1 == s3); // ✅ true  – both point to same pool literal
        System.out.println(s1 == s4); // ❌ false – s1 in pool, s4 in heap
        System.out.println(s1 == s5); // ✅ true  – s5 is interned, refers to pool like s1

        System.out.println(s1 == s2); // ❌ false – same as above
        System.out.println(s1 == s3); // ✅ true
        System.out.println(s1 == s4); // ❌ false
        System.out.println(s1 == s5); // ✅ true

        System.out.println("--comparing s2--");
        System.out.println(s2 == s3); // ❌ false – s2 in heap, s3 in pool
        System.out.println(s2 == s4); // ❌ false – both are separate heap objects
        System.out.println(s2 == s5); // ❌ false – s2 in heap, s5 in pool

        System.out.println("--comparing s3--");
        System.out.println(s3 == s4); // ❌ false – s3 in pool, s4 in heap
        System.out.println(s3 == s5); // ✅ true  – both refer to pool literal "Java"

        System.out.println("--comparing s4--");
        System.out.println(s4 == s5); // ❌ false – s4 in heap, s5 in pool


        System.out.println(s1.equals(s2)); // ✅ true – values are same
        System.out.println(s1.equals(s3)); // ✅ true – same literal
        System.out.println(s1.equals(s4)); // ✅ true – values are same
        System.out.println(s1.equals(s5)); // ✅ true – interned, same as s1

        System.out.println(s1.equals(s2)); // ✅ true
        System.out.println(s1.equals(s3)); // ✅ true
        System.out.println(s1.equals(s4)); // ✅ true
        System.out.println(s1.equals(s5)); // ✅ true

        System.out.println("--comparing s2--");
        System.out.println(s2.equals(s3)); // ✅ true – values are same
        System.out.println(s2.equals(s4)); // ✅ true – values are same
        System.out.println(s2.equals(s5)); // ✅ true – values are same

        System.out.println("--comparing s3--");
        System.out.println(s3.equals(s4)); // ✅ true – same content
        System.out.println(s3.equals(s5)); // ✅ true – both refer to string pool

        System.out.println("--comparing s4--");
        System.out.println(s4.equals(s5)); // ✅ true – same content

    }
}