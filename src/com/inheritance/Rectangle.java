package com.inheritance;

public class Rectangle extends Shape {

   private int length;
   private int breadth;



    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    protected double calculateArea() {

         double area = this.length*this.breadth;
        return area;
    }
}
