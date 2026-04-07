package com.app;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(4, 2));
        System.out.println("Sub: " + calc.subtract(4, 2));
        System.out.println("Mul: " + calc.multiply(4, 2));
        System.out.println("Div: " + calc.divide(4, 2));
    }
}