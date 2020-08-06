package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum =0;
        double count = 0;
        double arithmeticMean = 0;


        while (true) {
            int n = Integer.parseInt((reader.readLine()));
            if (n == -1) {
                break;
            } else if (n != -1) {
                count++;
                sum += n;

            }
        }
        arithmeticMean = sum / count;
        System.out.println(arithmeticMean);
        }


    }


