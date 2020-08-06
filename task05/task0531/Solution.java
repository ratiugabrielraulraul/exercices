package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
            //<boolean expression> ? <result if true> : <result if false>
        // this lines declares a variable 'm2' and sets it to (a is less than b) ?
        //'a' if that is true :  'b' if that is false
        int m2 = a < b ? a : b; //'m2' now holds the lessor of 'a' and 'b'
        // this line now checks if 'm2' is less than 'c' and sets it to 'm2' if that is true or
        // 'c' if that is false
        m2 = m2 < c ? m2 : c;// 'm2' now holds the lessor of 'm2' and 'c'
        // checks if 'm2' is less than 'd' and sets 'm2' to the lower of the '2'
        m2 = m2 < d ? m2 : d;
        // checks if 'm2' is less than 'e' and sets 'm2' to the lower of the 2
        m2 = m2 < e ? m2 : e;
        // 'm2' will now hold the lowest value of 'a', 'b', 'c', 'd', 'e'
        return  m2;
    }
}
