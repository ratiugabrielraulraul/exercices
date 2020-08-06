package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {

        if (this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength) {
            // comparison between this.cat(1st) and another cat
            // if the cat properties greater than anothercat prop
            //cat 1  wins and anotheCat2 loose else anotherCat loose
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {



    }
}
