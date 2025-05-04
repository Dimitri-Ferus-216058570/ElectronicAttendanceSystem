package org.example.creational_patterns.factory_method;

public class AdminAttendanceFactory extends AttendanceMarkerFactory {
    public AttendanceMarker createMarker() {
        return new AdminAttendanceMarker();
    }
}
