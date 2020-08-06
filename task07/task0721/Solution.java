package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];





        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = array[0];
        for (int j = 0; j < 20; j++) {
            if (array[j] > maximum) {
                maximum = array[j];
            }
        }
        int minimum = array[0];
        for (int k = 0; k < array.length; k++) {
            if (array[k] < minimum) {
                minimum = array[k];
            }
        }


        System.out.print(maximum + " " + minimum);
    }


}

