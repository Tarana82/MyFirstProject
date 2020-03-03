package day23;

public class Array {
    public static void main(String[] args) {
        //  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
        // print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min

        int[] nums = new int[7];
        nums[0] = 15;
        nums[1] = 27;
        nums[2] = 36;
        nums[3] = 45;
        nums[4] = 58;
        nums[5] = 69;
        nums[6] = 77;

        // 2nd way to create an array with values already filled
        int[] nums2 = new int[]{ 11, 2, 34, 4, 53, 6, 3 } ;

        // 3rd and shortest way
        //This must happen in one line, we can not declare first and assign later
        int[] nums3 = { 11, 2, 34, 4, 53, 6, 3 } ;

        for(int x = nums.length-1 ; x >=0 ; x-- ){
            System.out.println("x = " + nums[x] );
        }

        int arraySize = nums.length;
        int lastItemIndex = arraySize-1 ;

        int lastItemValue = nums[lastItemIndex] ;
        System.out.println("last Item Value = " + lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println("middle item value = " + nums[middleItemIndex]);

        int sum = 0;


    }
}
