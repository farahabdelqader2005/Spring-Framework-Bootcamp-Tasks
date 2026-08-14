package com.example.shapes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext container =
                     new ClassPathXmlApplicationContext(
                             "applicationContext.xml"
                     )) {
            Shape circle = container.getBean(
                    "circle",
                    Shape.class
            );
            Shape square = container.getBean(
                    "square",
                    Shape.class
            );
            circle.draw();
            square.draw();
        }
    }
}