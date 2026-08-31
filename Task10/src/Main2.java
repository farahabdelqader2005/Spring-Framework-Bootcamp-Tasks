import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Main2
{
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        Person person = new Person("Farah", "Mohammed", LocalDate.of(2005, 1, 1));
        session.save(person);

        Passport passport = new Passport(person, "ABC18D");
        session.save(passport);

        session.getTransaction().commit();

        Session session2 = sessionFactory.getCurrentSession();
        session2.beginTransaction();

        Person personFromDb = session2.get(Person.class, person.getId());
        System.out.println(personFromDb);
        System.out.println(personFromDb.getPassport());

        session2.getTransaction().commit();
    }
}
