package code03;

public class EscapeSequence {
    public static void main(String[] args) {
        // escape sequence
        // A character preceded by a backslahs (\) is an escape sequence and has special meaning to the compiler

        // Escape Sequence / Description

        //    \t  insert a tab in the text at this point
        //    \n   insert a newline in the text at this point
        //    \'  insert a single quote character in the text at this point
        //    \"  insert a double quote character in the text at this point
        //    \\  insert a backslash character in the text at this point

        System.out.println("Hello \t world");
        System.out.println("Hello \n world");
        System.out.println("Hello \' world");
        System.out.println("Hello \" world");
        System.out.println("Hello \\ world");

        System.out.println( "I like the book \" Java\" awesome ");
        System.out.println( "The move name is : \' Lord of the rings' " );
        System.out.println( "Hello\tworld");
        System.out.println( "Hello \n B15");

        // what is the equivilent of println and print, using one of the above
        System.out.println("This is regular print \n");
        System.out.println("This is println");






    }

}
