package com.Sujeeth;

public class Num_Of_Occ {
    public static void main(String[] args) {
        int n = 123223;

        int count = 0;

        while ( n > 0 ){
            int rem = n % 10 ;
            if ( rem == 2 ){   // counting no.of occurrence of 2
                count ++ ;
            }
            n = n / 10 ;
        }

        System.out.println("Number of occurrence of 2 :  " +count);
    }

}
