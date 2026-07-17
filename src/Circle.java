public class Circle implements Shape {
    private Draw2d draw2d;

    public Circle(Draw2d draw2d) {
        this.draw2d = draw2d;
    }

    public void draw() {
        this.draw2d.drawing();
        System.out.println("Drawing Circle");
    }
}
