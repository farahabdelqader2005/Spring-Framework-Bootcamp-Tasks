package com.example.shapes;

public class Square implements Shape {

    private Draw2d draw2d;
    private Draw3d draw3d;

    public Square() {
    }

    public void setDraw2d(Draw2d draw2d) {

        this.draw2d = draw2d;
    }

    public void setDraw3d(Draw3d draw3d) {

        this.draw3d = draw3d;
    }

    @Override
    public void draw() {

        draw2d.draw("Square");
    }

    public void drawIn3d() {

        draw3d.draw("Square");
    }
}
