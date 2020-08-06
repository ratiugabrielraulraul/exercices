package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[15];
        int even = 0;
        int odd = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                even += numbers[i];
            } else if (i % 2 == 1) {
                odd += numbers[i];
            }


        }
        if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        } else {
            System.out.println("Even-numbered houses have more residents.");
        }
    }

}






