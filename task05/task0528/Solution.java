package com.codegym.task.task05.task0528;

/* 
Display today's date

*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        String date = "MM dd yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(date);

        String date1 = simpleDateFormat.format(new Date());
        System.out.println(date1);
    }
}
