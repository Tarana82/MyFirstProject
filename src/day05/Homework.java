package day05;
 import java.util.Scanner;

 public class Homework {

 public static void main(String[] args) {

         /*
        Task 4 :
        create an interactive program to ask user for hourly wage
        and generate yearly salary
        assume that she works 2080 hour for a year
         */

            Scanner info= new Scanner(System.in);
            System.out.println("How much do you earn per hour ?");
            int hourlyWage = info.nextInt();
            int yearlySalary = hourlyWage * 1800;
            System.out.println("What is your yearly income ? " + yearlySalary);

            System.out.println("Your yearly salary based on the hourly wage rate of " + hourlyWage + "$ is equal to " + yearlySalary + "$ per year");
        }

}
