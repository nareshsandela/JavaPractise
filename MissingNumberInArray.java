import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {
    public static void main(String [] args){
        int[] num = {2,4,3,5};
        System.out.println(missingNumber(num));
    }

    //if only one number is missing in an array
    public static int missingNumber(int[] nums){
        int n = nums.length+1;
        int sum = (n*(n+1))/2;
        for(int num:nums){
//        sum=sum-num;
            sum-=num;
        }
        return sum;
    }
}
