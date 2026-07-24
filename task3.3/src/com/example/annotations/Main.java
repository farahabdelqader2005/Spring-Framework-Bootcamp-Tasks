package com.example.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = context.getBean(Circle.class);

        Square square = context.getBean(Square.class);

        System.out.println("the area of the circle = " + circle.getArea());

        System.out.println("the area of the Square = " + square.getArea());

        context.close();
    }
}