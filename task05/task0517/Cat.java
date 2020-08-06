package com.codegym.task.task05.task0517;

/* 
Creating cats
//- Name,
//- Name, weight, age
//- Name, age (standard weight)
//- Weight, color (name, address, and age are unknown; the cat is homeless)
//- Weight, color, address (someone else's pet)
//
//The constructor's job is to make the object valid.
//For example, if the weight is unknown, then you need to specify some average weight.
//A cat can't weigh nothing.
//The same applies to age. But there may or may not be a name (i.e. name might be null).
//The same applies to the address (it might be null).
//6. The class must have a constructor that takes a name as an argument, but initializes all variables except the address.
//7. The class must have a constructor that takes a name, weight, and age as arguments, and initializes all variables except the address.
//8. The class must have a constructor that takes a name and age as arguments, and initializes all variables except the address.
//9. The class must have a constructor that takes a weight and color as arguments, and initializes all variables except the name and address.
//10. The class must have a constructor that takes a weight, color, and address as arguments, and initializes all variables except the name.
*/

public class Cat {

    private String name = null;  //here may or may not be a name (i.e. name might be null).
    private int age;
    private int weight;
    private String address = null;  //The same applies to the address (it might be null).
    private String color;

    public Cat(String name) { //  'this' keyword only has two purposes
        this.name = name;     //First it helps the compiler understand which variable you refer to when the variables
        age = 5;              // that are passed into the constructor have the same exact name as the class properties.
        weight = 6;            //And second, the this keyword is also used to call a constructor from another constructor.
        color = "blue";

    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "yellow";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 4;
        color = "purple";
    }

    public Cat(int weight, String color) {
        name = null;
        address = null;
        this.weight = weight;
        this.color = color;
        age = 5;  //if the weight is unknown, then you need to specify some average weight.

    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;


    }


    public static void main(String[] args) {

    }
}
