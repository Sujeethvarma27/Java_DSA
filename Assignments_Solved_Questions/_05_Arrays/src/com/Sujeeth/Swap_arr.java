package com.Sujeeth;

import java.util.Arrays;

public class Swap_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int in1, int in2){
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
    }
}
