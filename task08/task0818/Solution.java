package com.codegym.task.task08.task0818;

import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Milles", 1500);
        map.put("Jon", 1500);
        map.put("Jordan", 1500);
        map.put("Kobe", 500);
        map.put("Ra", 150);
        map.put("r", 1500);
        map.put("raa", 1500);
        map.put("ra23", 1500);
        map.put("Rar", 1500);
        map.put("T213", 1500);


        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        HashMap<String, Integer> m = new HashMap<>(map);

        Iterator<Map.Entry<String, Integer>> iterator = m.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }


        }





    }




    public static void main(String[] args) {

    }
}