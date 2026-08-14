package com.example.vehicles;

public class Plane implements Vehicle {
    private String brand;
    private DatabaseOperation databaseOperation;

    public Plane() {
    }
    public void setBrand(String brand) {

        this.brand = brand;
    }
    public void setDatabaseOperation(
            DatabaseOperation databaseOperation
    ) {

        this.databaseOperation = databaseOperation;
    }
    @Override
    public void saveData() {

        databaseOperation.insert(
                "Plane",
                brand
        );
    }
}
