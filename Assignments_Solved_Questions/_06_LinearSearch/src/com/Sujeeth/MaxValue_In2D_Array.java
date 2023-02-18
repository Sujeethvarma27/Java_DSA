package com.Sujeeth;

public class MaxValue_In2D_Array {
    public static void main(String[] args) {
        int[][] arr= {
                {12,34,54},
                {23,43,2,6},
                {78,77,8},
        };

        System.out.println(max(arr));

    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            // each column in a row
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }


}
