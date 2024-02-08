package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnly= new RWOnly();

        rwOnly.setA(10);
        rwOnly.setB(15);
        rwOnly.getA();
      rwOnly.getB();
    }

  
}