package com.Sujeeth;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class First_Last_Occ {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,4,5,7,8};
        int target = 3;
        int[] ans = searchRange(nums,target);

        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] a = {-1,-1};

        a[0] = search(nums,target,true);
        if (a[0] != -1) {
            a[1] = search(nums, target, false);
        }

        return a;

    }
    static int search(int[] nums,int target,boolean isFirstOcc){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstOcc){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
