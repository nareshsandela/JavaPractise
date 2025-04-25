package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTelusko {


    public static void main(String[] args) {
//        sorting for Integers
        List<Integer> num = new ArrayList<>();
        num.add(433);
        num.add(894);
        num.add(341);
        num.add(659);
        num.add(216);
        num.add(922);


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                //comparing based on last digit i.e unit one's value i%10, similarly if we want to compare for middle value(Ten's value) then i%100
                if (i % 10 > j % 10) {
                    return 1;
                } else return -1;
            }
        };
        Collections.sort(num, comparator);
        System.out.println(num); //[341, 922, 433, 894, 216, 659]


    }
}





