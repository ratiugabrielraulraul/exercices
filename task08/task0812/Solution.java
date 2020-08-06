package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {  // enter 10 numbers

            Integer sr = Integer.parseInt(reader.readLine());
            list.add(sr);
        }

        int max = 1;
        int count = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                max++;
            } else {
                if (max >= count)
                    count = max;
                max = 1;

            }
        }

        if (max > count) {
            count = max;
        }

        System.out.println(count);
    }


}










