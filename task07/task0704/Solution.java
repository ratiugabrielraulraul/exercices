package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < array.length; i++) {
            int temp = array[array.length - i - 1];
            System.out.println(temp);
        }

    }
}
