package org.example;

class Parent extends User {
    private int parentId;
    private String phone;
    private String address;

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
