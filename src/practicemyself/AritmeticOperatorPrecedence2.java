package practicemyself;

public class AritmeticOperatorPrecedence2 {
    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 10;

        int sum = n1 + n2;
        int subtraction = n1 - n2;
        int division = n1 / n2;
        int multiplication = n1 * n2;
        int remainder = n1 % n2;
        System.out.println( sum+ "," +subtraction + "," + division + "," + multiplication + "," + remainder);

        //In Java addition comes after multiplication comes 3*2=6+4=10

        int num1 = 4 + 3 *2;
        System.out.println(num1);

         num1 = (4 + 3) * 2;
        System.out.println(num1);

        //Order of operator precedence
        //Operator and Symbols
        //Multiplication/Division,Modules    *,/,%
        //Addition/Subtraction   +,-

        num1 = (4 + 3)*2 + 4/2;
        System.out.println(num1);
        //here multiplication and division happens first
        //4+3=7,7*2=14,4/2=2,14+2=16








    }
}
