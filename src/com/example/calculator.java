package com.example;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        char choice;
 
        do {
            System.out.println("Console Calculator");
            System.out.println("Enter two numbers:");
 
            System.out.print("Number 1: ");
            double num1 = scanner.nextDouble();
 
            System.out.print("Number 2: ");
            double num2 = scanner.nextDouble();
 
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
 
            System.out.print("Enter your choice (1-4): ");
            int operation = scanner.nextInt();
 
            double result = performOperation(num1, num2, operation);
            System.out.println("Result: " + result);
 
            System.out.println("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
 
        } while (choice == 'y' || choice == 'Y');
 
        System.out.println("Calculator closed. Goodbye!");
    }
 
    private static double performOperation(double num1, double num2, int operation) {
        switch (operation) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero. Returning 0.");
                    return 0;
                }
            default:
                System.out.println("Invalid choice. Returning 0.");
                return 0;
        }
    }
}
