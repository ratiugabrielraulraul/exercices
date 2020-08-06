package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> main = new ArrayList<Integer>();
        ArrayList<Integer> firstSupp = new ArrayList<Integer>();
        ArrayList<Integer> secondSupp= new ArrayList<Integer>();
        ArrayList<Integer> thirdSupp = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int x = Integer.parseInt(s);
            main.add(x);
        }
        for (int i = 0; i < main.size(); i++) {
            if (main.get(i) % 3 == 0) {
               firstSupp.add(main.get(i));
            }
        }
        for (int i = 0; i < main.size(); i++) {
            if (main.get(i) % 2 == 0) {
                secondSupp.add(main.get(i));
            }
        }
        for (int i = 0; i < main.size(); i++) {
            if (main.get(i) % 3 != 0 && main.get(i) % 2 != 0) {
                thirdSupp.add(main.get(i));

            }
        }

        printList(firstSupp);
        printList(secondSupp);
        printList(thirdSupp);


    }

    public static void printList(List<Integer> list) {

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));

        }

    }
}
