package com.codegym.task.task08.task0824;

/* 
Make a family

*/
//String name, boolean sex, int age, and ArrayList<Human> children fields.

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> human = new ArrayList<>();
        Human child1 = new Human("Raul", true, 24, human);
        Human child2 = new Human("Adi", true, 24, human);
        Human child3 = new Human("Nico", true, 24, human);

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("Alex", true, 45, children);
        Human mother = new Human("Mona", false, 40, children);

        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(father);
        ArrayList<Human> parents2 = new ArrayList<>();

        parents2.add(mother);


        Human grandFather1 = new Human("George", true, 78, parents1);
        Human grandFather2 = new Human("ion", true, 88, parents2);

        Human grandMother1 = new Human("Maria", false, 75, parents1);

        Human grandMother2 = new Human("Manuela", false, 70, parents2);

        ArrayList<Human> family = new ArrayList<>();
        family.add(child1);
        family.add(child2);
        family.add(child3);
        family.add(father);
        family.add(mother);
        family.add(grandFather1);
        family.add(grandMother1);
        family.add(grandFather2);
        family.add(grandMother2);

        for (Human persons : family) {
            System.out.println(persons.toString());
        }

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }


        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
