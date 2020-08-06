package com.codegym.task.task03.task0304;

/* 
Task with percentages

*/

public class Solution {
    public static double addTenPercent(int i) {
            // sum the current value to the percentage wanted and then multiply by the current value
        double c = i + 0.1 * i;
        return c;

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
