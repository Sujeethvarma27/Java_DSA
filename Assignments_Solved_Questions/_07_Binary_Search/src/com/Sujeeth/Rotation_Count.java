package com.Sujeeth;

public class Rotation_Count {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(countrotations(arr));
    }

    private static int countrotations(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;

    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
