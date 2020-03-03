package code13;

public class TestStringStartWithOrEndWith2 {
    public static void main(String[] args) {

        String name = "Tarana";

        System.out.println( name.startsWith("Ta")  );
        System.out.println( name.startsWith("ta")  );
        System.out.println( name.startsWith("Tac") );

        System.out.println( name.endsWith("a") );
        System.out.println( name.endsWith("U") );
        System.out.println( name.endsWith("E" +
                "") );

    }
}
