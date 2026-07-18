package com.example.vehicles;

public class Car implements Vehicle {

    private final String brand;

    private final DatabaseOperation databaseOperation;

    public Car(
            String brand,
            DatabaseOperation databaseOperation
    ) {

        this.brand = brand;
        this.databaseOperation = databaseOperation;
    }

    @Override
    public void saveData() {

        databaseOperation.insert(
                "Car",
                brand
        );
    }
}
