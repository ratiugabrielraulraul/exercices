package com.codegym.task.task05.task0514;

/* 
A programmer creates a person

*/

public class Solution {
    public static void main(String[] args) {

        Person person = new Person();
        person.initialize("Adi",35);
        }

    static class Person {
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
