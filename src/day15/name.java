package day15;

public class name {
    public static void main(String[] args) {

        String myName ="Tarana";

//        System.out.println(myName.length());



        if(myName.length()<4){
            System.out.println("short name");
        }else if(myName.length()>4 &&myName.length()>11){
            System.out.println("medium name");
        }else if(myName.length()<11){
            System.out.println("longer name");
        }

    }
}

