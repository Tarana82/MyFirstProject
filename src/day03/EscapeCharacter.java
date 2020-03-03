package day03;

public class EscapeCharacter {
    public static void main(String[] args) {
        System.out.println("    Hello \\ world"    );// these double dash  gives us one dash,while we print
        System.out.println( " I like the book \"Java\" awesome"  ); // these dash gives us double quote around world
        System.out.println("The move name is : \'Lord of the rings\' " ); // these dash gives us single quote around world
        System.out.println( "Hello\tWorld" ); // \t prints the word next to each other
        System.out.println("Hello \n  B15");// \n prints the word on the next line

    }
}




/*public class EscapeSequence {
    public static void main(String[] args) {
        System.out.println("Hello\tworld"); // Hello world
        System.out.println("Hello\nworld"); // Hello
        //world
        System.out.println("Hello\'world"); //Hello'world
        System.out.println("Hello\\world"); //Hello\world
        System.out.println("Hello\"world"); //Hello"world
        System.out.println("I love \"Java\" "); //I love "Java"
    }

}
*/