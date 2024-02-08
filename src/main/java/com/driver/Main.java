package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnly= new RWOnly();

        rwOnly.setA(10);
        rwOnly.setB(15);
        System.out.println("The value of a is : "+rwOnly.getA());
        System.out.println("The value of b id : "+rwOnly.getB());
    }

  
}