package com.company;

public class Main {

    public static void countBlocks (int levels){
        int total = 0;
        for (int i=0; i<levels; i++){
            total = total + (i*i);
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
	// write your code here
countBlocks(10);

        System.out.println("hello world :) Im clever so I will get this ");
    }
}
