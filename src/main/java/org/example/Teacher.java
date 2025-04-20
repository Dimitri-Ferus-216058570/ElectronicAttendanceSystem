package org.example;

class Teacher extends User {
    private int teacherId;
    private String address;
    private String studentId;
    private String classGroup;

    public Teacher(int userId, String name, String email, String password, int teacherId, String address, String classGroup) {
        super(userId, name, email, password);
        this.teacherId = teacherId;
        this.address = address;
        this.studentId = studentId;
        this.classGroup = classGroup;
    }

    public void markAttendance() {
        System.out.println("Marking attendance for class group: " + classGroup);
    }

    public void updateAttendance() {
        System.out.println("Updating attendance");
    }

    public void searchStudent() {
        System.out.println("Searching for a student");
    }

    public void viewAttendanceReport() {
        System.out.println("Viewing attendance report");
    }

    public void viewGraph() {
        System.out.println("Viewing attendance graph");
    }
}
