package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {


            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                maximum = a > maximum ? a : maximum;
            }
            System.out.println(maximum);
        }
    }


}

