package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/
//watermelon - melon,
//banana - fruit,
//cherry - fruit,
//pear - fruit,
//cantaloupe - melon,
//blackberry - fruit,
//ginseng - root,
//strawberry - fruit,
//iris - flower,
//potato - tuber.

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("watermelon", "melon");
        map.put("banana", "fruit");
        map.put("cherry", "fruit");
        map.put("pear", "fruit");
        map.put("cantaloupe", "melon");
        map.put("blackberry", "fruit");
        map.put("ginseng", "root");
        map.put("strawberry", "fruit");
        map.put("iris", "flower");
        map.put("potato", "tuber");


        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }


    }
}
