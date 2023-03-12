package com.Sujeeth;

public class Search_in_Mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int ans = search(arr,5);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int peak = peakoftheMountain(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length - 1);
    }

    static int peakoftheMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target,int start,int end){
        // checking whether given array is sorted in ascending order or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }

}
