package com.codegym.task.task09.task0902;

/* 
Stack trace revisited

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //write your code here
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return Thread.currentThread().getStackTrace()[2].getMethodName();

        //write your code here
    }

    public static String method5() {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();


        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }
}
