package Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class ForEachDemo {
    public static void main(String[] args) {

        //using regular method
//        List<Integer> nums= Arrays.asList(3,1,6,8,2,4,9);
//        Consumer<Integer> consumer = new Consumer<>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
//        nums.forEach(consumer);
//    }

        List<Integer> nums = Arrays.asList(3, 1, 6, 8, 2, 4, 9);
        nums.forEach(n -> System.out.println(n));

    }
}
