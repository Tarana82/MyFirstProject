package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
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
