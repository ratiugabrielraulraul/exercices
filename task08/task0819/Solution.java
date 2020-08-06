package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {

    public static class Cat {

        public Cat() {

        }

    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {

        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static void printCats(Set<Cat> cats) {


        for (Cat text : cats) {
            System.out.println(text);

        }

    }

    // step 1
}
