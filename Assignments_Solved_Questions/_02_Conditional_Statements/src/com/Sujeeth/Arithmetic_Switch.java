package com.Sujeeth;

import java.util.Scanner;

public class Arithmetic_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.print("Enter operator : ");
        char ch = in.next().trim().charAt(0);

        //  Normal switch case

//        switch (ch){
//            case '+':
//                System.out.println("Sum of two numbers : " +(a+b));
//                break;
//            case '-':
//                System.out.println("Subtraction of two numbers : " +(a-b));
//                break;
//            case '*':
//                System.out.println("Product of two numbers : " +(a*b));
//                break;
//            case '/':
//                System.out.println("Division of two numbers : " +(a/b));
//                break;
//            case '%':
//                System.out.println("Modulo of two numbers : " +(a%b));
//                break;
//            default :
//                System.out.println("Enter a valid operator");
//       }

        // Enhanced Switch
        switch (ch) {
            case '+' -> System.out.println("Sum of two numbers : " + (a + b));
            case '-' -> System.out.println("Subtraction of two numbers : " + (a - b));
            case '*' -> System.out.println("Product of two numbers : " + (a * b));
            case '/' -> System.out.println("Division of two numbers : " + (a / b));
            case '%' -> System.out.println("Modulo of two numbers : " + (a % b));
            default -> System.out.println("Enter a valid operator");
        }
    }
}
