package com.codegym.task.task08.task0814;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            set.add(i);

        }



        return  set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) {
                it.remove();
            }

        }
        return  set;


    }

    public static void main(String[] args) {

    }
}
