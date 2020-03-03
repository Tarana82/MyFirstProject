package day15;

public class Task {
    public static void main(String[] args) {
        String name = "Tarana";
        if (name.length() < 4) {
            System.out.println("short name" );
        } else if (name.length() > 3 && name.length() < 11) {
            System.out.println("medium name" );
        } else if (name.length() > 11) {
            System.out.println("longer name" );
        }

        if (name.contains("a" ) || name.contains("e" )) {
            System.out.println("name contains a or e " );
        } else {
            System.out.println("don't have both a or e in my name" );
        }
    }
}
