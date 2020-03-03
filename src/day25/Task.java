package day25;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        // pick up your own name and turn in into
        // char array and use for each loop to loop over them
        // optionally count how many a you have in your name
        String name = "Alesya";

        char[] namesChars = new char[6] ;//[name.length() ];

        for(int x = 0; x < namesChars.length; x++) {

            namesChars[x] = name.charAt(x);
        }
        System.out.println("namesChars = " + Arrays.toString(namesChars));

        char[] namesChars2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars2));






    }
}



