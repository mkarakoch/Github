package SelfStudy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, selection;

        System.out.print("Enter the first number : ");
        num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        num2 = scan.nextInt();
        System.out.println("\nPlease choose the mathematical operation you would like to do :");
        System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
        selection = scan.nextInt();

        if (selection == 1) {
            System.out.println("Addition :" + (num1 + num2));
        } else if (selection == 2) {
            System.out.println("Subtraction : " + (num1 - num2));
        } else if (selection == 3) {
            System.out.println("Multiplication : " + (num1 * num2));
        } else if (selection == 4) {
            if (num2==0) {
                System.out.println("Division by 0 is not a correct mathematical operation");
            }else {
                System.out.println("Division : " + (num1 / num2));

        }   }else{
            System.out.println("Please enter a valid selection");
    }














    }
}
