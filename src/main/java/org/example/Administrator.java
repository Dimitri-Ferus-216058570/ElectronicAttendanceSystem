package org.example;

public class Administrator extends User {

    private int adminId;
    private String address;
    private String classGroup;

    public Administrator(int userId, String name, String email, String password, int adminId, String address) {
        super(userId, name, email, password);
        this.adminId = adminId;
        this.address = address;
    }
}
