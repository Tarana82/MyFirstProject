package code07;

public class PreIncrementPostIncrement {
    public static void main(String[] args) {

       // int score =10;
    /* Increment and decrement operator ++ -- has two version
    Pre -increment ++score
    Post increment score++

    Pre-decrement --score
    Post decrement score--
    */
    // incremente a
        int apple =8;
        apple++ ; //incrementing by one --->> 9
        System.out.println(apple ); // 9 // printing the increase value //this is nextLine

        // System.out.println(++apple); // increasing the value and print the value

        // apple++ , when ++ comes after teh variable
        // its called post increment
        // it will increase the value
        // But it will reflect the increased the value next time the variable show up!!
        System.out.println(apple++);
        System.out.println(apple); // this is nextLine

        int score = 50 ;

        System.out.println( ++score ); // 51

        System.out.println( score ++ ); // 51 and ready to be 52 next time it shows up

        System.out.println( score ); // 52

        System.out.println( --score ); // 51

        System.out.println( score --); // still 51 ready to be 50 next time it shows up !!

        System.out.println( score ); // 50
}
}