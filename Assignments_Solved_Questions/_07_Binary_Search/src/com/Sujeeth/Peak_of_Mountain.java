package com.Sujeeth;

public class Peak_of_Mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,4,1};
        int ans = peakoftheMountain(arr);
        System.out.println(ans);

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
}
