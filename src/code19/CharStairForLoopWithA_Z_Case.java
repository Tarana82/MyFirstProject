package code19;

public class CharStairForLoopWithA_Z_Case {
    public static void main(String[] args) {

        String line = "";

        for (char iChar = 'A'; iChar < 'Z'; iChar++) {
            // for (char iChar = 'A'; iChar <= 'Z'; iChar++) {

            line += iChar;
            System.out.println(line);
        }
    }
    }