import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape circle = (Shape)context.getBean("circleShape");
        circle.draw();
        Shape square = (Shape)context.getBean("squareShape");
        square.draw();
        context.close();
    }
}