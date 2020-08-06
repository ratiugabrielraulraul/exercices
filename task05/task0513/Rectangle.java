package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/
//Create a Rectangle class. The data for this class will be top, left, width, height.
//Create as many initialize(...) methods as possible
//
//Here are some examples:
//-	4 parameters are specified: left, top, width, and height
//-	width/height is not specified (both are 0)
//-	height is not specified (it is equal to the width), we'll create a square
//-	create a copy of another rectangle passed as an argument

public class Rectangle {

    private int  top ;
    private int left ;
    private int width  ;
    private int height ;


    public void initialize(int top, int left,int width, int height) {
        this.top =top;
        this.left = left;
        this.width = width;
        this.height = height;

    }

    public void initialize(int top ,int width , int height) {
        this.top = top;
        this.left = left;
        width = height;
        height = width;
    }

    public void initialize(int top, int left) {
        this.top= top;
        this.left= left;
        width = 0;
        height = 0;
    }

    public void initialize(int left) {
        this.left = left;


    }












    public static void main(String[] args) {

    }
}
