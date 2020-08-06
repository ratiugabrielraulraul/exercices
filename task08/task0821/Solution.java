package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {

        HashMap<String, String> people = new HashMap<>();
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");
        people.put("Silaghi", "Adi");




        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
