public class Square implements Shape {
    private Draw3d draw3d;

    public Square() {
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    public void draw() {
        this.draw3d.drawing();
        System.out.println("Drawing Square");
    }
}

