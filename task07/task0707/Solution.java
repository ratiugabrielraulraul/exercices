package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Kiwi");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");


        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        }
    }

