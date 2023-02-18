package com.Sujeeth;

public class MinValue_In2D_Array {
    public static void main(String[] args) {
        int[][] arr= {
                {12,34,54},
                {23,43,2,6},
                {78,77,8},
        };

        System.out.println(min(arr));
    }
    static int min(int[][] arr) {
        int minValue = Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            // each column in a row
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < minValue) {
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }
}
