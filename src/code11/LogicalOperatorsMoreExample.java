package code11;

public class LogicalOperatorsMoreExample {
    public static void main(String[] args) {

            // find out whether this number is more than 100 or less than 10

            // find out the number is within the range of 10-60
            // and print out the result
            // and print out the result zk

            int x = 55;
            System.out.println(" ----  x > 100 || x < 10 ---- ");
            System.out.println(x > 100 || x < 10);

            System.out.println(" ----  x > 10 && x < 60 ---- ");
            System.out.println(x > 10 && x < 60);

            // more than 2 conditions at the same time ,  3 conditions
            //true || false --->> true
            System.out.println("result of true || false || false  ");
            System.out.println(true || false || false);

            System.out.println("result of true && true && false   ");
            //   true  && false  ----->> false
            System.out.println(true && true && false);
            // false || false ->false || true -->> true

            System.out.println("running this -->>> x==50  || x==51   ||  x==55   ");
            System.out.println(x == 50 || x == 51 || x == 55);

            // == is checking for equality , != is checking for inequality

            System.out.println("running this -->>> x>50 && x != 52  || x==57   ");
            // check
            // x is more than 50
            // and x is not equal to 52
            // or  x equal to 57
            // true && true
            //true || false --->> true
            System.out.println(x > 50 && x != 52 || x == 57);

            System.out.println(false || true && true);



        }
    }

