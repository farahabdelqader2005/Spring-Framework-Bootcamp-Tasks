package com.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
