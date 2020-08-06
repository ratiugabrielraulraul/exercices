package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Raul",10,8,10);
        Cat cat2 = new Cat("Alex", 9, 5, 6);
        Cat cat3 = new Cat("Adi", 3, 4, 4);



    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}