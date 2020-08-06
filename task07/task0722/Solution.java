package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s =reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("end")) {
                break;
            } else {
                System.out.println(list.get(i));
            }
            }
        }

    }
