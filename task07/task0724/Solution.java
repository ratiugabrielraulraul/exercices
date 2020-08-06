package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {

        Human grandFather1 = new Human("Alex",true,67);
        Human grandFather2 = new Human("George",true,71);
        Human grandMother3= new Human("Elsa",false,60);
        Human grandMother4 = new Human("Elena",false,70);

        Human father = new Human("Cosmin",true,31,grandFather1,grandMother3);
        Human mother = new Human("Alexandra",false,30,grandFather2,grandMother4);

        Human child1  = new Human("Raul",true,15,father,mother);
        Human child2 = new Human("Cristian",true,12,father,mother);
        Human child3  = new Human("Sara",false,20,father,mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother3.toString());
        System.out.println(grandMother4.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());



    }

    public static class Human {
         String name;
         boolean sex;
         int age;
         Human father;
         Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}