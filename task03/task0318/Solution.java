package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/
//Kevin will take over the world in 8 years. Mwa-ha-ha!
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //The order in which the data is input matters a lot.
        // Enter the number and name from the keyboard.
        String number = reader.readLine(); //Read a string from the keyboard
        int year = Integer.parseInt(number); //Convert the string to a number.
        String name = reader.readLine();



        System.out.println(name + " will take over the world in " + year + " years. Mwa-ha-ha!");


    }
}
