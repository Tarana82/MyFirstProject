package code04;

public class StringPractice {
    public static void main(String[] args) {

        String firstName = " Tarana " ;
        String lastName = " Ahmadova ";
        String fullName = firstName +"\t"+ lastName;

        System.out.println( "My first name is " + firstName);
        System.out.println( "My last name is " + lastName);
        System.out.println( " My full name is " + fullName );

        String productName = "Dell";
        String model = "HD";
        int version = 8;
        float price = 89.00f;

        System.out.println( " I ordered from Amazon " + productName +" computer " );
        System.out.println( " The product model is " + model );
        System.out.println( " The version is " + version );
        System.out.println( " The price is " + price );

        System.out.println( " I ordered " + productName +" computer "
                + model + version
                + " from Amazon " + price);


    }
}
