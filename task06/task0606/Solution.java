package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        for (int i = 1; i < a; i = i * 10) {
            int b = a / i;
            if (b % 2 == 0) even++;
            else odd++;


        }


        System.out.println("Even: " + even + " Odd: " + odd);


    }
}
