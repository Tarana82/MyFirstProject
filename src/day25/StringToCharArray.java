package day25;

public class StringToCharArray {
    public static void main(String[] args) {

        String name = "Anastasiya";
        // turn this into charArray using toCharArray() method of String

        // toCharArray() is a method of String that turn string into char array
        char[] allCharsInName = name.toCharArray();

        for (char eachChar : allCharsInName) {
            System.out.println("eachChar = " + eachChar);
        }

        // now count how many a we have
        int count = 0;
        for (char eachChar : allCharsInName) {

            if (eachChar == 'a') {
                ++count;
            }

        }
        System.out.println("count = " + count);

    }
}