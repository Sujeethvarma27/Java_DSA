package com.Sujeeth;

import java.util.Scanner;

public class Prime_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println(n);
        int count = 0;

        if(n<=1){
            System.out.println("given number is neither prime nor composite");
            return;
        }else {
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Prime number ");
        }else{
            System.out.println("Composite number ");
        }
    }
}
