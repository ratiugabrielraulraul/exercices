package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        int shortest = 0;
        int longest = 0;


        for (int i = 0; i < 10; i++) {
            String user = reader.readLine();
            list.add(user);
        }

        String sht = list.get(0);
        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() > sht.length()) {
                sht = list.get(i);
                shortest = i;

            }}
            String longe = list.get(0);


            for (int i = 1; i < 10; i++) {
                if (list.get(i).length() < longe.length()) {
                    longe = list.get(i);
                    longest = i;
                }
            }
            if (shortest < longest) {
                System.out.println(list.get(shortest));
            } else {
                System.out.println(list.get(longest));
            }
        }


    }

















