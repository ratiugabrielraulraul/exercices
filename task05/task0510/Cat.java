package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
   private String name = null;
   private  int weight = 4;
   private int age = 4;
   private String address = null;
   private String color = "black";


    public void initialize(String name) {
    this.name = name;
    this.weight = weight;
    this.color = color;
    this.age =age;
    }

    public void initialize(String name,int weight,int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;

    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;


    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = age;


    }

    public void initialize(int weight, String color, String address) {
        this.age =age;
        this.weight = weight;
        this.address = address;
        this.color = color;

    }



    public static void main(String[] args) {

    }
}
