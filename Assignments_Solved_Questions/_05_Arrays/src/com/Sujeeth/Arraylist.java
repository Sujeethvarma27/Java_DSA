package com.Sujeeth;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        // syntax

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(6343);
        list.add(44);
        list.add(234);
        list.add(23);

        System.out.println(list.contains(44));
        System.out.println(list);

    }
}
