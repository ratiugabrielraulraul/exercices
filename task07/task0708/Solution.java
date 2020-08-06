package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        Solution.strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int longest = 0;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        for (int i = 0; i < strings.size(); i++) {  // to find the longest String
            if (strings.get(i).length() > longest) {
                longest = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) { // to find all String that have the same lenght as longest and display them
            if (strings.get(i).length() == longest) {
                System.out.println(strings.get(i));
            }
        }

        }



    }
