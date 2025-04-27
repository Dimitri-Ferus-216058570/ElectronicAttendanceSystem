package org.example;

public class Student extends User {
    private int studentId;
    private String grade;
    private int classGroupId;
    private int parentId;
    private String address;
    private String dob;

    public Student(int userId, String name, String email, String password, int studentId, String grade, int classGroupId, int parentId, String address, String dob) {
        super(userId, name, email, password);
        this.studentId = studentId;
        this.grade = grade;
        this.classGroupId = classGroupId;
        this.parentId = parentId;
        this.address = address;
        this.dob = dob;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getClassGroupId() {
        return classGroupId;
    }

    public void setClassGroupId(int classGroupId) {
        this.classGroupId = classGroupId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void viewAttendanceReport() {
        System.out.println("Viewing attendance report for student " + studentId);
    }

    @Override
    public void viewProfile() {
        super.viewProfile();
        System.out.println("Additional student profile info: Grade - " + grade);
    }
}
