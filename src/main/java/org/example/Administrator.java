package org.example;

public class Administrator extends User {

    private int adminId;
    private String address;
    private String classGroup;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public Administrator(int userId, String name, String email, String password, int adminId, String address) {
        super(userId, name, email, password);
        this.adminId = adminId;
        this.address = address;
    }
}
