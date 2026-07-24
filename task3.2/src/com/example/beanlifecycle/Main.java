package com.example.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        context.getBean("databaseOperations", DatabaseOperations.class);

        context.close();
    }
}
