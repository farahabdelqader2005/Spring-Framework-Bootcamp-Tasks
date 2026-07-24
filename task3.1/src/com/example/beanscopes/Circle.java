package com.example.beanscopes;

public class Circle implements Shape {

    private Draw2d draw2d;
    private Draw3d draw3d;

    public Circle(Draw2d draw2d, Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }
    @Override
    public void drawShape() {
        draw2d.draw("Circle");
        draw3d.draw("Circle");
    }
}