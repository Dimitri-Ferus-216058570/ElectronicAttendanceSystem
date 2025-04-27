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

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public void mark() {
        System.out.println("Marking attendance");
    }

    public void update() {
        System.out.println("Updating attendance");
    }
}
