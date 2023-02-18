package com.Sujeeth;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // initializing 2D array
//        int[][] arr2D = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };

        int[][] arr2D = new int[3][3];

        // Input
        for (int row = 0; row < arr2D.length; row++) {
            // each column in a row
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        // Output
//        for (int row = 0; row < arr2D.length; row++) {
//            // Each column in a row
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col] +" ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }


    }
}
