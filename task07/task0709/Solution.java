package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int shortest = 0;

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);


        }
        String k = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < k.length()) {
               k = list.get(i);

            }
        }


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == k.length()) {
                System.out.println(list.get(i));
            }
        }

    }
}
