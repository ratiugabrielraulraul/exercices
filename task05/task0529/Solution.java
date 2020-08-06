package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int total = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while (true) {

            String s = reader.readLine();
            if (s.equals("sum")){

                System.out.println(total);
            break;
        }else {
                int x = Integer.parseInt(s);
                total += x;
            }

        }

    }
}
