package com.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ratiu", "Raul1");
        map.put("Ratiu1", "Raul");
        map.put("Ratiu2", "Raul");
        map.put("Ratiu3", "Raul5");
        map.put("Ratiu4", "Raul33");
        map.put("Ratiu5", "Raul22");
        map.put("Ratiu6", "Raul3");
        map.put("Ratiu7", "Raul11");
        map.put("Ratiu44", "Raul44");
        map.put("Ratiu55", "Raul4");


        return map;


    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> test = new ArrayList<>();

        for(Map.Entry<String, String> pair : map.entrySet()){
            if(!test.contains(pair.getValue())) test.add(pair.getValue());
            else{
                removeItemFromMapByValue(map, pair.getValue());
                removeFirstNameDuplicates(map);
                break;
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
