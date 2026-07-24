package com.example.beanscopes;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle1 = context.getBean("circleShape", Circle.class);
        Circle circle2 = context.getBean("circleShape", Circle.class);

        circle1.drawShape();

        System.out.println("Circle singleton : " + (circle1 == circle2));

        Square square1 = context.getBean("squareShape", Square.class);
        Square square2 = context.getBean("squareShape", Square.class);

        square1.drawShape();

        System.out.println("Square prototype : " + (square1 == square2));

        context.close();
    }
}