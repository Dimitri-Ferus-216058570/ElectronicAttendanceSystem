package org.example;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void logIn() {
        System.out.println("User logged in");
    }

    public void logOut() {
        System.out.println("User logged out");
    }

    public void viewProfile() {
        System.out.println("Viewing profile of " + name);
    }
}

