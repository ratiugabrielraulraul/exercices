package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("AUGUST 1 1980"));
        map.put("Stallone2", df.parse("SEPTEMBER 1 1980"));
        map.put("Stallone3", df.parse("JULY 1 1980"));
        map.put("Stallone4", df.parse("MARCH 1 1980"));
        map.put("Stallone5", df.parse("MAY 1 1980"));
        map.put("Stallone6", df.parse("SEPTEMBER 1 1980"));
        map.put("Stallone7", df.parse("JUNE 3 1980"));
        map.put("Stallone8", df.parse("JUNE 12 1980"));
        map.put("Stallone9", df.parse("MAY 5 1980"));


        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Calendar c = Calendar.getInstance();

        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Date> entry = itr.next();
            c.setTime(entry.getValue());
            if (c.get(Calendar.MONTH) == 5 || c.get(Calendar.MONTH) == 6 || c.get(Calendar.MONTH) == 7) {
                itr.remove();
            }
        }


    }

    public static void main(String[] args) {

    }
}
