package com.Sujeeth;

public class Binary_Search_Code {
    public static void main(String[] args) {

        int[] arr = {-12,-8,0,1,4,6,9,12,16,17,20,36,40};
        int target = 16;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        // return index
        // if element is not found in given array return -1
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
        return -1;
    }
}
