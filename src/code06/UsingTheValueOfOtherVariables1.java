package code06;
import java.util.Scanner;
public class UsingTheValueOfOtherVariables1 {
    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber ;

        System.out.println( " My Favorite Number " + myFavoriteNumber );
        System.out.println( " Your Favorite Number " + yourFavoriteNumber );

        yourFavoriteNumber = 100;
        System.out.println( "My Favorite Number " + myFavoriteNumber );
        System.out.println( "Your Favorite Number " + yourFavoriteNumber);


    }
}
