package office_hour;

import java.util.Arrays;

public class Practice_12_09 {
    public static void main(String[] args) {
        int num = 9;
        num = 15;
        System.out.println(num);

        int[] nums= new int[4];
        nums[0] = 5;
        //I assign value of bun variable to 2 member of array
        nums[1] = num;
        nums[2] = 25;
        nums[3] = 22;
        // print info about array
        //toString() - method, that returns human readable information about array
        System.out.println(Arrays.toString(nums));
        System.out.println("How many numbers in  array ? "+nums[nums.length-1]);
        System.out.println(nums[1]);
        System.out.println("Last value in array: "+nums[nums.length-1]);
        System.out.println("Middle value is: "+nums[nums.length/2]);


    }
}
