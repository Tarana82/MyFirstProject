package day03;

public class EscapeSequence {
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
