package com.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

    private double side;

    public Square() {
        this.side = 3;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
