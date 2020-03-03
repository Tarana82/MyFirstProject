package repl;
import java.util.*;

public class Repl113 {


        public static void main(String[] args) {
            // above code will ask user 10 numbers while creating an array
            // just assume that you have int array with 10 numbers and start working on requirement
            // loop through the array and get the sum of the even numbers
            //TODO: Write your code below

            int count=0;
            Scanner input = new Scanner(System.in);
            int[] nums = new int[10];
            for(int i = 0 ; i<=9 ; i ++){
                nums[i] = input.nextInt();
                if(nums[i]%2==0){
                    count++;

                    System.out.println(count);
                }
            }
        }
}
