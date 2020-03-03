package day23;

public class TaskArray {
    public static void main(String[] args) {
        //  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
        // print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min
        int[] num = new int[7];
        num[0] = 15;
        num[1] = 27;
        num[2] = 36;
        num[3] = 45;
        num[4] = 58;
        num[5] = 69;
        num[6] = 77;
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);
        int itemCount = num.length;
        for (int x = itemCount - 1; x >= 0; x--) {
            System.out.println("num: " + num[x]);

        }
    }
}