package day15;

public class StringCaseSensitiveCheck {
    public static void main(String[] args) {

        String name = "Tarana Ahmadova";

        System.out.println(   name.contains( "Ah") );

        String uppercaseName = name.toUpperCase() ; // "TARANA AHMADOVA";
        System.out.println("uppercaseName contains AH or not ? " + uppercaseName.contains("AH") );

        String lowercaseName = name.toLowerCase() ; //"tarana ahmadova";
        System.out.println("lowercaseNmae contains ah or not ? " + lowercaseName.contains("ah") );

        System.out.println(name);

    }
}
