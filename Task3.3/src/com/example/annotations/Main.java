//package com.example.annotations;
//import java.util.Scanner;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Main {
//    Scanner scanner = new Scanner(System.in);
//
//    double input = scanner.nextDouble();
//    public static void main(String[] args) {
//
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Circle circle = context.getBean(Circle.class);
//
//        Square square = context.getBean(Square.class);
//
//        System.out.println("the area of the circle = " + circle.getArea());
//
//        System.out.println("the area of the Square = " + square.getArea());
//
//        context.close();
//    }
//}
package com.example.annotations;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your value: ");
        double input = scanner.nextDouble();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = context.getBean(Circle.class);
        Square square = context.getBean(Square.class);
        circle.setRadius(input);
        square.setSide(input);

        System.out.println(
                "the area of the circle = " + circle.getArea()
        );
        System.out.println(
                "the area of the Square = " + square.getArea()
        );
        context.close();
        scanner.close();
    }
}