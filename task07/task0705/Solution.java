package com.codegym.task.task07.task0705;



import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] largeArray = new int[20];

        int[] smallArrayA = new int[10];
        int[] smallArrayB = new int[10];

        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < 10; j++) {
            smallArrayA[j] = largeArray[j];
        }
        for (int k = 10; k < 20; k++) {
            smallArrayB[k-10] = largeArray[k];
        }
        for (int y = 0; y < 10; y++) {
            System.out.println(smallArrayB[y]);
        }


    }


}

