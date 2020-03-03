package code09;

public class EvenOddFinder {
    public static void main(String[] args) {

        //Divide by 2 no remainder is even , remainder 1 is odd

        //  Write a program to find out a number is even or odd
        // If the number is even then says this is a even number
        // if the number is odd then says this is a odd number

        int myNumber = 204 ;

        System.out.println(myNumber/2  );
        System.out.println( myNumber%2 );

        int remainder = myNumber%2 ;

      //  if( remainder == 0 ) {
        if( myNumber%2 ==0){

            System.out.println("EVEN NUMBER!!!");
        } else{
            System.out.println(" ODD NUMBER !!! ");

        }


    }
}
