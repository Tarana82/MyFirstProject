package code05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        // asking user are you recording
        System.out.println( " are you recording ?");
        boolean isRecording = blabla.nextBoolean ();

        System.out.println(" We are recording " + isRecording);

    }



}


