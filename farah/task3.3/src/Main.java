import ios.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext container =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape circle = container.getBean("circle", Shape.class);

        circle.draw();
    }
}
