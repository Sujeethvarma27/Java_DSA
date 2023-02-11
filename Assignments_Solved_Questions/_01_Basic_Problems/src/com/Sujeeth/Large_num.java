package com.Sujeeth;

import java.util.Scanner;

public class Large_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b){
            System.out.println(+a +" is the largest value ");
        }else{
            System.out.println(+b +" is the largest value ");
        }
    }
}
