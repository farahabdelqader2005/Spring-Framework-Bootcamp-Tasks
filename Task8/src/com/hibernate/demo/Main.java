package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory =
                new Configuration()
                        .configure("hibernate-config.xml")
                        .addAnnotatedClass(Dummy.class)
                        .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        Dummy dummy = new Dummy(1, "Farah", "Mohammed");

        session.beginTransaction();

        session.save(dummy);

        session.getTransaction().commit();
    }
}
