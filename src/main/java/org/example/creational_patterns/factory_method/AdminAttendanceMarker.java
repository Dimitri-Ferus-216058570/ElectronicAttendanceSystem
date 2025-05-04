package org.example.creational_patterns.factory_method;

public class AdminAttendanceMarker implements AttendanceMarker {
    public void markAttendance() {
        System.out.println("Administrator marking attendance...");
    }
}