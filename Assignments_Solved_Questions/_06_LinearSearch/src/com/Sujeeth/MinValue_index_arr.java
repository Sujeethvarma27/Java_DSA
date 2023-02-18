package com.Sujeeth;

public class MinValue_index_arr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 44, 45, 39, 90, 21, 8, -1, 0, -29};
        System.out.println(minIndex(arr));
    }

    static int minIndex(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = i; // assigning the index value of min value to the min variable
            }
        }
        return min; // returning the index of the min value in the array
    }
}
