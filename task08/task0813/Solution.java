package com.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 words that start with the letter "L"

*/

public class Solution {
    static String wordL = "L";
   static String wordA = "a";

    public static Set<String> createSet() {

        HashSet<String> list = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            list.add(wordL);
            addA();

        }
        return list;


    }

    public static void addA() {
        wordL+= wordA;
    }

    public static void main(String[] args) {

    }
}
