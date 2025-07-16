package com.constrChaining;

public class Animal {
    protected String  type;
    protected  int qty;
    protected String color;

    Animal(){
        this("Mammal",6);
        System.out.println("Default constructor of ANIMAL CLASS");
    }
    Animal(String type, int qty){
        this("Brown");
        System.out.println("The type is: "+type+"\n \t\t and the quantity is: "+qty+".");

    }
    Animal(String color){
        System.out.println("Color is: "+color);
    }



}
