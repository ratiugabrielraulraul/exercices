package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {

            e.printStackTrace();
            System.out.println("ArithmeticException has been caught.");


        }

    }

    public static void divideByZero() {
        int y = 68 / 0 ;
        System.out.println(y);
    }
}
