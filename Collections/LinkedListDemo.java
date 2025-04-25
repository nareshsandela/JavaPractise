package Collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList<String> fruits = new LinkedList<>();
        //add() elements and prints boolean
        System.out.println(fruits.add("Apple")); //true
        fruits.add("Banana");
        fruits.add("Carrot");
        System.out.println(fruits); //[Apple, Banana, Carrot]

        //addFirst() to insert the specified element at the begging of the LinkedList
        fruits.addFirst("Grapes");
        System.out.println(fruits); //[Grapes, Apple, Banana, Carrot]

//        The addLast() method inserts the specified element at the end of the LinkedList.
        fruits.addLast("Mango");
        System.out.println(fruits); //[Grapes, Apple, Banana, Carrot, Mango]

        //The addAll() method adds all elements of a collection to the LinkedList by using addAll(Arrays.asList())
        fruits.addAll(Arrays.asList("Raddish","Pomogranate"));
        System.out.println(fruits); //[Grapes, Apple, Banana, Carrot, Mango, Raddish, Pomogranate]

        //The get() method returns the element at the specified index.
        System.out.println(fruits.get(1)); //Apple

        //The getFirst() method returns the first element of the LinkedList
        System.out.println(fruits.getFirst()); //Grapes

//        The getLast() method returns the last element of the LinkedList
        System.out.println(fruits.getLast()); //Pomogranate

        //The set() method updates the element at the specified index.
        System.out.println(fruits.set(1,"Guava"));
        System.out.println(fruits); //[Grapes, Guava, Banana, Carrot, Mango, Raddish, Pomogranate]

      //  The remove() method removes the element at the specified index or the first occurrence of the specified element.
        //If we don't mention Index, it will delete first element
        System.out.println(fruits.remove());
        System.out.println(fruits);

//        The removeFirst() method removes and returns the first element of the LinkedList.
        System.out.println(fruits.removeFirst());
        System.out.println(fruits);

//The removeLast() method removes and returns the last element of the LinkedList.
        System.out.println(fruits.removeLast());
        System.out.println(fruits);

//        The clear() method removes all elements from the LinkedList.
//        fruits.clear();
//        System.out.println(fruits); // []

//        The size() method returns the number of elements in the LinkedList
        System.out.println(fruits.add("Mango"));
        System.out.println(fruits.size()); //5

        //The contains() method checks if the LinkedList contains a specified element.
        System.out.println(fruits.contains("Orange")); //false

        //The indexOf() method returns the index of the first occurrence of the specified element.
        System.out.println(fruits.indexOf("Mango")); //2

        //The lastIndexOf() method returns the index of the last occurrence of the specified element.
        System.out.println(fruits);
//        System.out.println(fruits.lastIndexOf("Banana")); //0

//        The toArray() method converts the LinkedList into an array.
        String[] fruitsArray = fruits.toArray(new String[0]);
        for (String fruit : fruitsArray){
            System.out.println(fruit);
        }
        //output is
        // Banana
        //Carrot
        //Mango
        //Raddish
        //Mango



       //The iterator() method returns an iterator for the elements in the LinkedList.
        Iterator<String > iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //output is
        // Banana
        //Carrot
        //Mango
        //Raddish
        //Mango


        //listIterator() returns an iterator for the elements in the forward by using hasNext() and next() methods
//listIterator() returns an iterator for the elements in the backward direction by using hasPrevious() and previous() methods
//If we directly call hasPrevious() , it returns output as -1 as we don't have anything. so to call hasPrevious() we need to first iterate through hasNext()
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //output is
        // Banana
        //Carrot
        //Mango
        //Raddish
        //Mango
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        //out put is
        // Mango
        // Raddish
        // Mango
        // Carrot
        //Banana

//subList() returns the view of the portion of the ArrayList between the specified indexes
        //It gives output of sublist between fromIndex and toIndex including the fromIndex element but don't include the toIndex element
        List<String> subListOfArray = fruits.subList(1,3);
        System.out.println(subListOfArray); //output is [Carrot, Mango]

    }
}


