package com.Sujeeth;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,12,14,15,17};
        int target = 10;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    // return index of the smallest number >= target
    static int ceiling(int[] arr, int target){

        // return -1 if greatest number in the array is smaller than the target
        if ( target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }else if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return start;

    }
}
