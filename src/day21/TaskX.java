package day21;

public class TaskX {
    public static void main(String[] args) {

        String name = "Tarana";
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.substring(i, i + 1).equalsIgnoreCase("b")) {
                System.out.println("My name has: " + name.charAt(i));
                break;
            }
        }
    }
}
