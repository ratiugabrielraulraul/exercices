package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat tomCat = new Cat("Tom", 9, "Blue");

        Dog topsyDog = new Dog("Topsy", 3, "Grey");

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int age;
        String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public static class Dog {
        String name;
        int age;
        String color;


        public Dog(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;

        }
    }


    //write your code here
}
