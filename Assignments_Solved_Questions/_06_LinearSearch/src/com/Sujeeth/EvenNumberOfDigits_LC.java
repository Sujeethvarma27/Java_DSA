package com.Sujeeth;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNumberOfDigits_LC {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check even digits or not
    static boolean even(int nums) {
        int numberOfdigits = digits(nums);
        return numberOfdigits % 2 == 0;
    }
    // function to evaluate no.of digits
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
