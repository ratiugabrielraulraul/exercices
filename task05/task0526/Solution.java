package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Raul",15,"Joshua21");
        Man man2 = new Man("Adrian",16,"Wisconsin");

        Woman woman1 = new Woman("Sara",14,"North");
        Woman woman2 = new Woman("Andra",24,"West");

        System.out.println(man1.name + " " +man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);


        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man(String name) {
            this.name = name;

        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }


    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }


}
