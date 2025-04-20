package org.example;

class Attendance {
    private int attendanceId;
    private int studentId;
    private String date;
    private boolean present;

    public Attendance(int attendanceId, int studentId, String date, boolean present) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    public void mark() {
        System.out.println("Marking attendance");
    }

    public void update() {
        System.out.println("Updating attendance");
    }
}
