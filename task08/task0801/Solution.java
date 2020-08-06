package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/
//watermelon
//banana
//cherry
//pear
//cantaloupe
//blackberry
//ginseng
//strawberry
//iris
//potato
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {

        HashSet<String> fruits = new HashSet<String>();
        fruits.add("watermelon");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("pear");
        fruits.add("cantaloupe");
        fruits.add("blackberry");
        fruits.add("ginseng");
        fruits.add("strawberry");
        fruits.add("iris");
        fruits.add("potato");


        for (String set : fruits) {
            System.out.println(set);
        }

    }
}
