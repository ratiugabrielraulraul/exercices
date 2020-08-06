package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String upperCaseLine = " ";

        Scanner lineScan = new Scanner(line);

        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCaseLine.trim());



    }
}
