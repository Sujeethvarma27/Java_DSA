package com.Sujeeth;

import java.util.Arrays;

public class Search_In2D_Array {
    public static void main(String[] args) {
        int[][] arr= {
            {12,34,54},
            {23,43,2,6},
            {78,77,8},
        };
        int target = 8;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target){
        int [] ans = {-1,-1};
        for (int row = 0; row < arr.length; row++) {
            // each column in a row
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    ans[0] = row;
                    ans[1] = col;
                }
            }
        }
        return ans;
    }
}
