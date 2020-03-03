package day17;

public class Task2 {
    public static void main(String[] args) {
        String name = "Tarana", fullName = "ahmadova";
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Name is = " + name);
        fullName = fullName.substring(0,1).toUpperCase() + fullName.substring(1).toLowerCase();
        System.out.println("FullName = " + fullName);
    }
}
