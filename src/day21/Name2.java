package day21;

public class Name2 {
    public static void main(String[] args) {

            String name = "Jean Hidalgo";
            int charCount = name.length();
            int lastCharCount = charCount - 1;
            for (int x = 0; x <= 10; x++) {
                System.out.print(name.substring(x, x + 1));
                if (name.substring(x, x + 1).equalsIgnoreCase("h")) {
                    break;
                }
            }
        }
    }



