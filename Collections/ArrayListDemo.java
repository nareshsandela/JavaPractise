package Collections;

import java.util.*;

//ArrayList is a resizable array implementation of List Interface which has dynamic size(shrink and grow if needed)
public class ArrayListDemo {
    public static void main(String args[]){
        List<String> names = new ArrayList<>();

        //add() to add names
        names.add("Arya");
        names.add("Bhargav");
        names.add("Charan");
        System.out.println(names); //output is [Arya, Bhargav, Charan]

        //addAll() to add names using addAll(Arrays.asList())
        names.addAll(Arrays.asList("Rohan","Dheeraj"));
        System.out.println(names); //output is [Arya, Bhargav, Charan, Rohan, Dheeraj]

        //get() values based on Index
        //Throws IndexOutOfBoundException if we give Index which is not there
        System.out.println(names.get(4)); //output is Dheeraj

        //set() updates the elements  based on Index
        names.set(3,"Yuvraj");
        System.out.println("After set(): "+names); //output is [Arya, Bhargav, Charan, Yuvraj, Dheeraj]

        //remove() elements based on the Index or by directly by mentioning element or the first occurrence of the specified element
//       System.out.println(names.remove(2)); //based on Index remove element // output is [Arya, Bhargav, Yuvraj, Dheeraj]
//      System.out.println(names.remove("Dheeraj")); //based on element provides true if available else if element is not available //output is true


        //The clear() method removes all elements from the ArrayList and provides empty array if we print
//        System.out.println(names.clear()); //output is []


        //The size() method returns the number of elements in the ArrayList.
        System.out.println(names.size()); //output is 5

        //isEmpty() checks if the array is empty and returns boolean value
//        System.out.println(names.isEmpty()); //output is false
//        names.clear();//clear deletes all the elements in the arraylist
//        System.out.println(names.isEmpty()); //output is true

        //contains() check if the specified element is available and returns boolean value
        System.out.println(names.contains("Dheeraj")); //output is true

        //indexOf() returns of the first occurrence of the specified element
        System.out.println(names.indexOf("Dheeraj")); //output is 4
        System.out.println(names.indexOf("Dheerajjjjj")); //output is -1 if element not available

        //lastIndexOf() returns of the last occurrence of the specified element
        System.out.println(names.lastIndexOf("Dheeraj")); //output is 4
        System.out.println(names.indexOf("Dheerajjjjj")); //output is -1 if element not available

        //toArray() converts arrayList into an array
//        String[] namesArray = names.toArray(new String[0]);
//        for (String name : namesArray){
//            System.out.println(name);
//        }

        //iterator() method return an itertor for the elements in the Arraylist in the forward direction
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

 //example 2 of Iterarator method
//        Iterator<String> namesArray = names.iterator();
//        while (namesArray.hasNext()){
//            System.out.println(namesArray.next());
//        }

    //listIterator() returns an iterator for the elements in the forward by using hasNext() and next() methods
//listIterator() returns an iterator for the elements in the backward direction by using hasPrevious() and previous() methods
//If we directly call hasPrevious() , it returns output as -1 as we don't have anything. so to call hasPrevious() we need to first iterate through hasNext()
        ListIterator<String> listIterator = names.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //output is
//            Arya
//            Bhargav
//            Charan
//            Yuvraj
//            Dheeraj
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        //out put is
//Dheeraj
//Yuvraj
//Charan
//Bhargav
//Arya

//subList() returns the view of the portion of the ArrayList between the specified indexes
        //It gives output of sublist between fromIndex and toIndex including the fromIndex element but don't include the toIndex element
        List<String> subListOfArray = names.subList(1,3);
        System.out.println(subListOfArray); //output is [Bhargav, Charan]

    }
}
