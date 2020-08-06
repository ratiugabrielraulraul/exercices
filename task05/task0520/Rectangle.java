package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    private int top;
    private int left;
    private int width = 0;
    private int height = 0;

    public Rectangle(int top) {
        this.top=top;

    }

    public Rectangle(int top, int left) {
        this.top =top;
        this.left = left;
    }

    public Rectangle(int left, int width, int height) {
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
