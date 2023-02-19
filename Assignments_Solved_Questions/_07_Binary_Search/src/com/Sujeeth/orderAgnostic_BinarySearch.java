package com.Sujeeth;

public class orderAgnostic_BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {-12,-8,0,1,4,6,9,12,16,17,20,36,40};
        int target1 = 12;
        int ans1 = orderAgnosticBS(arr1, target1);
        System.out.println(ans1);

        int[] arr2 = {40,36,20,17,16,12,9,6,4,1,0,-8,-12};
        int target2 = -12;
        int ans2 = orderAgnosticBS(arr2,target2);
        System.out.println(ans2);

    }

    static int orderAgnosticBS(int[] arr, int target){
        // return index
        // if element is not found in given array return -1
        int start = 0;
        int end = arr.length - 1;
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


