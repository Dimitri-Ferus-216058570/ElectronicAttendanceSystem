package org.example.creational_patterns.singleton;

public class DatabaseConnection {

    private static DatabaseConnection connection;

    private DatabaseConnection() {
        System.out.println("Connecting to Attendance DB...");
    }

    public static DatabaseConnection getInstance() {
        if (connection == null) {
            connection = new DatabaseConnection();
        }
        return connection;
    }

    public void connect() {
        System.out.println("Connected to DB successfully.");
    }
}
