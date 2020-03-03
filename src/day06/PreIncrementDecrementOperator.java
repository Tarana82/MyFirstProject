package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {

        // initializing(giving value ) offerCount value to 2
        int offerCount = 2;
        // increasing the number by one using normal way ;
        offerCount = offerCount + 1;//here offer count is 3

        // this is increasing the value by one using compound/shorthand operator
        offerCount += 1; // here offerCount is 4

        // Since increasing or decreasing a value is very special
        // and often used in programming
        // There is even shorter shortcut for this operation
        // and we use  ++ or --  , THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        // We can NOT use it for any other time like increasing or decreasing value by more than one .
        ++offerCount; // here offerCoubt is 5// this is same as offerCount +=1 ; and this offerCount = offerCount + 1 ; it's just shorter
        System.out.println("Offer Now after increasing by one " + offerCount);

        --offerCount; // here offerCount is 4, because of decreasing
        System.out.println("Offer Now after decreasing by one " + offerCount);


    }
}
