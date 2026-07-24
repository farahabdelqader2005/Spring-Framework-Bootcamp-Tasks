package com.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    private double radius;

    public Circle() {
        this.radius = 3;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }
}
