package com.Sujeeth;

import java.util.Arrays;

public class Reverse_arr {
    public static void main(String[] args) {

        int[] arr1 = {22,34,12,15,99,86,74};
        int[] arr2 = { 35, 23, 55, 67};

        reverseArr(arr1);
        reverseArr(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
