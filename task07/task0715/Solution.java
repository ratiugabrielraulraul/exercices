package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        list.add("Sam"); // 0
        list.add("I"); // 1
        list.add("Am"); // 2


        for (int i = 1; i < 6; i+=2) {  // start from Sam and add Ham after each word  i+= 2
            list.add(i, "Ham");
        }
        for (String s : list) {
            System.out.println(s);
        }

        }

    }

