package Collections;


import java.util.Arrays;

//An array is a collection of elements of the same data type stored in contiguous memory locations. Arrays are fixed in size, meaning that once they are created, their size cannot be changed.
public class ArrayDemo {
    public static void main(String [] args){
//        Declaring an array
//        int[] numbers;
//        String[] names;

//        initialize at declaration
        int [] numbers = {2,4,1,6,5};

//        initialize after declaration
//        numbers= new int[5];

        //looping in Array
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

//output is
// 2
//4
//1
//6
//5

        //using for each loop
        for (int num:numbers){
            System.out.println(num);
        }


        //copying array using  Arrays.copyOf(numbers,numbers.length);
        int [] numbersCopy = Arrays.copyOf(numbers,numbers.length);
            System.out.println(Arrays.toString(numbersCopy)); //[2, 4, 1, 6, 5]


        //sorting
        Arrays.sort(numbersCopy);
        System.out.println("Sorted array is : "+ Arrays.toString(numbersCopy)); //[1, 2, 4, 5, 6]


        //search for index of an element
        int indexOfElement = Arrays.binarySearch(numbers,6);
        System.out.println("Index of element is : "+ indexOfElement); //3


        //fill arrays with a specified value
        int [] numb = new int[6];
        Arrays.fill(numb,3);
        System.out.println(Arrays.toString(numb)); //[3, 3, 3, 3, 3, 3]

        //summing elements in array
        int addArray = 0;
        for (int num:numbers){
            addArray+= num;
        }
        System.out.println(addArray); //18

        int max=numbers[0];
        int min=numbers[0];
        //max element
        for (int num: numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
            System.out.println("Max element is :"+ max); //Max element is :6
            System.out.println("Min element is :"+ min); //Min element is :

    }

    //reverse the array



}
