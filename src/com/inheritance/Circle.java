package com.inheritance;

public class Circle extends Shape {

    private static final double PI = 3.14159;
    private   double radius=56;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        double area = PI*this.radius*this.radius;
      return area;
    }
}
