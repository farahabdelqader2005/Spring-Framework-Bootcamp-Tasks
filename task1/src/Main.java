import ios.shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext container =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        shape circle = container.getBean("circle", shape.class);

        circle.draw();
    }
}
