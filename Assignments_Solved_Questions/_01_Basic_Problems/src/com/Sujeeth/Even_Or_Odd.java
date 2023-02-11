package com.Sujeeth;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();

        if(a%2 == 0){
            System.out.println(+a +" is an Even number ");
        }else{
            System.out.println(+a +" is an odd number ");
        }



    }
}
