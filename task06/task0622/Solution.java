package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt((reader.readLine()));
        int b = Integer.parseInt((reader.readLine()));
        int c = Integer.parseInt((reader.readLine()));
        int d = Integer.parseInt((reader.readLine()));
        int e = Integer.parseInt((reader.readLine()));

        int[] list = new int[]{a, b, c, d, e};

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


    }
}
