package com.codegym.task.task06.task0603;

/* 
Cat and Dog objects: 50,000 each

*/

public class Solution {
    public static void main(String[] args) {


        for (int i = 1; i <= 50000; i++) {
            Dog dog1 = new Dog();
            Cat cat1 = new Cat();
        }
    }


}


class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
