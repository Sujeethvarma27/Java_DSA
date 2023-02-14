package com.Sujeeth;


import java.util.Scanner;

public class Prime_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        Prime(n);

//        Prime(0);
//        Prime(1);
//        Prime(2);
//        Prime(3);
//        Prime(10);
//        Prime(15);
//        Prime(97);

    }

    static void Prime ( int n ){
        int count = 0 ;
        if ( n <= 0 || n ==1 ){
            System.out.println(n +" is neither prime nor composite");
            return;
        }

        for ( int i = 2 ; i <= n/2 ; i++){
            if ( n % i == 0){
                count ++;
            }
        }
        if (count == 0){
            System.out.println(n +" is a Prime number");
        } else {
            System.out.println(n +" is a Composite number ");
        }
    }
}
