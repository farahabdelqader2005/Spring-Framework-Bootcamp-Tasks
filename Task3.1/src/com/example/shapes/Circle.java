package com.example.shapes;

public class Circle implements Shape {

    private final Draw2d draw2d;
    private final Draw3d draw3d;

    public Circle(
            Draw2d draw2d,
            Draw3d draw3d
    ) {

        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    @Override
    public void draw() {

        draw2d.draw("circle");
    }

    public void drawIn3d() {

        draw3d.draw("circle");
    }
}
