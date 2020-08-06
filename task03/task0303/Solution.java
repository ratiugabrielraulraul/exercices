package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertEurToUsd(5,1.08));
        System.out.println(convertEurToUsd(6,1.08));
    }


    public static double convertEurToUsd(int eur, double exchangeRate) {

        return eur * exchangeRate;


    }
}
