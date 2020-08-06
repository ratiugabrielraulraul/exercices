package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
       Zerg unit1 = new Zerg();
       unit1.name = "Alex";

       Zerg unit2 = new Zerg();
       unit2.name = "Patrick";

       Zerg unit3 = new Zerg();
       unit3.name = "Raul";

       Zerg unit4 = new Zerg();
       unit4.name = "Axel";

       Zerg unit5 = new Zerg();
       unit5.name = "Pablo";


       Protoss unit6 = new Protoss();
       unit6.name = "Kyle";

       Protoss unit7 = new Protoss();
       unit7.name = "Kim";

       Protoss unit8 = new Protoss();
       unit8.name = "Robe";

       Terran unit9 = new Terran();
       unit9.name = "Gabriel";

       Terran unit10 = new Terran();
       unit10.name = "Cristian";

       Terran unit11 = new Terran();
       unit11.name = "Adrian";

       Terran unit12 = new Terran();
       unit12.name = "Lewis";




    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
