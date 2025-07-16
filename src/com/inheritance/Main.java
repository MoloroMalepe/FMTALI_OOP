package com.inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle(56);
        Rectangle rectangle=new Rectangle(87,92);
        Triangle triangle = new Triangle(46,48);

        System.out.println("The calculated area for CIRCLE is: "+circle.calculateArea()+" meters squared.");
        System.out.println("The calculated area for RECTANGLE is: "+rectangle.calculateArea()+" meters squared.");
        System.out.println("The calculated area for TRIANGLE is: "+triangle.calculateArea()+" meters squared.");



    }
}