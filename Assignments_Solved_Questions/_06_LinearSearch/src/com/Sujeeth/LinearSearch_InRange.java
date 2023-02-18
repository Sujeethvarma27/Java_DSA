package com.Sujeeth;

public class LinearSearch_InRange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 44, 45, 39, 90, 21};
        int target = 90;

        int ans = linearSearch(arr,target,2,7);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        // base case
        if(arr.length == 0){
            return -1;
        }
        // Searching for target using for loop
        for (int i = start; i <= end; i++) {
            if (arr[i] == target){
                return i; // returning the index of the target element
            }
        }

        // if both the cases are false indicates target element is not in given array
        return -1;

    }
}
