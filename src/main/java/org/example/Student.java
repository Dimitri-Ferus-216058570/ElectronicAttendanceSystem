package org.example;

class Student extends User {
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

    public void viewAttendanceReport() {
        System.out.println("Viewing attendance report for student " + studentId);
    }

    @Override
    public void viewProfile() {
        super.viewProfile();
        System.out.println("Additional student profile info: Grade - " + grade);
    }
}
