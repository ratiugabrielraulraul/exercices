package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {




    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> set = new HashSet<>();
        set.add(new Dog());
        set.add(new Dog());
        set.add(new Dog());

        return set;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);


        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        for (Cat cat1 : cats) {
            pets.remove(cat1);
        }

    }

    public static void printPets(Set<Object> pets) {

        for (Object r : pets) {
            System.out.println(r);

        }

    }

    public static class Dog {
    }

    public static class Cat {
    }

}
