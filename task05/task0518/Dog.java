package com.codegym.task.task05.task0518;

/* 
Dog registration

*/


public class Dog {
   private String name =null;
   private int height;
   private String color = null;

    public Dog(String name) {
        this.name = name;

    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;

    }

    public Dog(String name, int height, String color) {
        this.name =name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
