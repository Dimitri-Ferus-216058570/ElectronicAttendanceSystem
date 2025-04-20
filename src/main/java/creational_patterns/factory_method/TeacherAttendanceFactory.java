package creational_patterns.factory_method;

public class TeacherAttendanceFactory extends AttendanceMarkerFactory {
    public AttendanceMarker createMarker() {
        return new TeacherAttendanceMarker();
    }
}
