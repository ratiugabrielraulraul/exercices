package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {


    public static int convertToSeconds(int hour){

        int min = 3600;

        return  min * hour;


    }

    public static void main(String[] args) {

        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(6));
        }
}
