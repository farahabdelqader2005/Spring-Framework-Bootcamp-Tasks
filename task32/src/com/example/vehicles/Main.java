package com.example.vehicles;

import org.springframework.context.support
        .ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {

        try (
                ClassPathXmlApplicationContext container =
                        new ClassPathXmlApplicationContext(
                                "applicationContext.xml"
                        )
        )
        {
            Vehicle car =
                    container.getBean(
                            "car",
                            Vehicle.class
                    );
            Vehicle plane =
                    container.getBean(
                            "plane",
                            Vehicle.class
                    );
            car.saveData();

            plane.saveData();
        }
    }
}