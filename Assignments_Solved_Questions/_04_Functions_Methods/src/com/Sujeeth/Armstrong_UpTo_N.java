package com.Sujeeth;

public class Armstrong_UpTo_N {
    // Print 3 digit armstrong numbers
    public static void main(String[] args) {


        for (int i = 100; i < 1000; i++) {
            if ( Armstrong(i)){
                System.out.print(i +" ");
            }
        }

    }

    static boolean Armstrong ( int n ){
        int Original = n ;
        long sum = 0;

        while ( n > 0 ){
            int rem = n % 10 ;
            sum = sum + rem * rem * rem ;
            n = n / 10 ;
        }
        return Original == sum ;
    }
}
