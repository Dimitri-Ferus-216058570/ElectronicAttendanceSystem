package org.example;

public class Parent extends User {
    private int parentId;
    private String phone;
    private String address;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Parent(int userId, String name, String email, String password, int parentId, String phone, String address) {
        super(userId, name, email, password);
        this.parentId = parentId;
        this.phone = phone;
        this.address = address;
    }

    public void viewStudentAttendance() {
        System.out.println("Parent viewing student attendance");
    }
}
