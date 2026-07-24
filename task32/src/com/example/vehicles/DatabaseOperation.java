package com.example.vehicles;

public class DatabaseOperation {

    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void insert(String vehicleType, String brand) {
        connectToDatabase();
        System.out.println(
                "Saving vehicle type: " + vehicleType
        );
        System.out.println(
                "Saving vehicle brand: " + brand
        );
        System.out.println(
                "Data saved successfully."
        );
    }
    private void connectToDatabase() {

        System.out.println(
                "Connecting to database: " + url
        );

        System.out.println(
                "Using username: " + username
        );
    }
}