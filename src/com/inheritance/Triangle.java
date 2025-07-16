package com.inheritance;

public class Triangle extends Shape {

private int height;
private int base;


    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    protected double calculateArea() {
         double area=(height*base)/2;
        return area;
    }
}
