package day15;

import jdk.swing.interop.SwingInterOpUtils;

public class ReplaceMethod {

    public static void main(String[] args) {

        String message = "I love Pumpkin , Pumpkin IS FUN!";

       message = message.replace("Pumpkin","Java!");

        System.out.println(message);

        String message2 = "Happy Thanksgiving to All!";

        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println("message2 =" + message2);

        String message3 = "TOMORROW IS OFF NO";
        System.out.println(message3.replace("NO!",""));


    }

}
