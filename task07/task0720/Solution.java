package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time



 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();


        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {               // Enter the size of the list
            list.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {               //Enter the number of the elements you want to be placed on the end
            list.add(list.get(0));                    //of the list
            list.remove(0);
        }

        for (String string : list) {
            System.out.println(string);
        }

    }
}





