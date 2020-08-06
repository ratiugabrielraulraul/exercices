package com.codegym.task.task03.task0319;

/* 
Predictions

*/
//Nick will receive 10000 in 5 years.
//<name> will receive <number1> in <number2> years.

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String number = reader.readLine();
        int salary = Integer.parseInt(number);
        String number2 = reader.readLine();
        int years = Integer.parseInt(number2);

        System.out.println(name + " will receive " + salary + " in " + years + " years.");



    }
}
