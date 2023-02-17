package com.Sujeeth;

import java.util.Arrays;
import java.util.Scanner;

public class Input_output_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr;
        arr = new int[5];
        // assigning values to each index
//        arr[0] = 1;
//        arr[1] = 23;
//        arr[2] = 77;
//        arr[3] = 20;
//        arr[4] = 4;

        System.out.print("Enter elements : ");
        // Assigning values using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//        // Printing given elements
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] +" ");
//        }

        // printing elements using Arrays.toString
        System.out.println(Arrays.toString(arr));

    }
}
