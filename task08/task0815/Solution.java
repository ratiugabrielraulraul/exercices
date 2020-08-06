package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<>();
        map.put("Jamila1", "Ka");
        map.put("Jamila2", "K");
        map.put("Jamila3", "Kapchela");
        map.put("Jamila4", "Kapchelaaa");
        map.put("Jamila5", "Ka");
        map.put("Jamila6", "K");
        map.put("Jamila7", "Kapchela");
        map.put("Jamila8", "Kapchelaaa");
        map.put("Jamila9", "Kapchela");
        map.put("Jamila10", "Kapchela");

        return  map;




    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {

        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)) {
                count ++;
            }
        }
        return  count;

    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName)) {
                count ++;

            }
        }
        return  count;


    }

    public static void main(String[] args) {

    }
}
