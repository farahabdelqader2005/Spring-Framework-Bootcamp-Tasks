import entity.Course;
import entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = (new Configuration()).configure("hibernate-config.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            List<Student> students = new ArrayList();
            students.add(new Student("Farah", "Abdelqader", (List)null));
            students.add(new Student("Amal", "ALi", (List)null));
            students.add(new Student("Hanan", "Ahmed", (List)null));
            List<Course> courses = new ArrayList();
            courses.add(new Course("Math"));
            courses.add(new Course("Science"));
            courses.add(new Course("physics"));

            for(Course course : courses) {
                session.save(course);
            }

            for(Student student : students) {
                student.setCourses(courses);
                session.save(student);
            }

            session.getTransaction().commit();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        } finally {
            sessionFactory.close();
        }

    }
}