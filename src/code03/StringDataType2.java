package code03;

public class StringDataType2 {
    public static void main(String[] args) {

        // String is a sequence of characters, surrounded by double quotes ("")

        String greeting;
        // greeting = "Hello World";
        //  concatination +

        String name = "Tarana";
        int age = 18;
        double height =5.6;
        char myLastNameFirstChar = 'A';
        boolean isMarried = true;
        byte childrenCount = 2;
        String city = "Houston";


        System.out.println(" My name is " + name );
        System.out.println( " My age is " + age );
        System.out.println( " My height is " + height);
        System.out.println( " My last name firts letter is " + myLastNameFirstChar);
        System.out.println( " I am married " +isMarried);
        System.out.println( " I have " + childrenCount + " children ");
        System.out.println( " I am living in " + city );

        System.out.println( " My name is " + name + "." + " My age is " + age + "." +" My height is " + height +"." + " My last name firts letter is " + myLastNameFirstChar + "."+" I am married " +isMarried + "." + " I have " + childrenCount + " children. " + " I am living in " + city);




    }
}


