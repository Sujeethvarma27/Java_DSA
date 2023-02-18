package com.Sujeeth;

import java.util.Scanner;

public class Max_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
