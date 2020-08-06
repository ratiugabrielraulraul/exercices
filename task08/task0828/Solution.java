package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameOfTheMonth = reader.readLine();

        HashMap<Integer, String> mapList = new HashMap<>();
        mapList.put(1, "January");
        mapList.put(2, "February");
        mapList.put(3, "March");
        mapList.put(4, "April");
        mapList.put(5, "May");
        mapList.put(6, "June");
        mapList.put(7, "July");
        mapList.put(8, "August");
        mapList.put(9, "September");
        mapList.put(10, "October");
        mapList.put(11, "November");
        mapList.put(12, "December");

        for (Map.Entry<Integer, String> dayAndMonth : mapList.entrySet()) {
            if (nameOfTheMonth.equals(dayAndMonth.getValue())) {
                System.out.println(nameOfTheMonth + " is month " + dayAndMonth.getKey());
            }
            //May is month 5"

        }


    }
}
