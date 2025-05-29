package org.example.String;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String args[]){
        System.out.println("main");
        Main obj = new Main();
    }
    static {
        System.out.println("static");
    }
    {
        System.out.println("non static");
    }
    Main(){
        System.out.println("Constrcutor");
    }
//    public static void main(String[] args) {
//        Optional<String> str= null;
//        print(str);
//        Map<Integer,String> hmap = new HashMap<>();
//        List<Integer> opt = Arrays.asList(1,2,3,4);
//        opt.add(5);
//        opt.get(6);
//        hmap.put(1,"Apple");
//        hmap.put(2,"Banana");
////        hmap.put("3","Mango");
//        hmap.put(null,"Strawberry");
//        hmap.put(null,"Orange");
//        for(Map.Entry<Integer ,String> entry : hmap.entrySet())
//        {
////            hmap.put("4","Banana");
//           System.out.println("Key is : " + entry.getKey() + entry.getValue());
//        }
//
//
//
//    }
//    public static void print(String str){
//        System.out.println(str.length());
//    }
}