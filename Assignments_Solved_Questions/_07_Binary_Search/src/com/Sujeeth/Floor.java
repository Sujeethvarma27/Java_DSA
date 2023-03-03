package com.Sujeeth;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,12,14,15,17};
        int target = 10;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    // return index of the greatest value <= target
    static int ceiling(int[] arr,int target){
        //if target is the smallest among all the elements in the array the return -1
        if ( target < arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                start = mid + 1;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }
        }
        return end;
    }
}
