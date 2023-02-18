package com.Sujeeth;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1},
                {2,5,1},
        };
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col= 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
