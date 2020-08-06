package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[10];
        int[] num = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();         // array of string to introduced

        }
        for (int i = 0; i < 10; i++) {    // Recording the lenght of the each string

            num[i] = array[i].length();
        }
        for (int i = 0; i < 10; i++) {   // Display the numbers  of the second loop line by line
            System.out.println(num[i]);
        }


    }
}




