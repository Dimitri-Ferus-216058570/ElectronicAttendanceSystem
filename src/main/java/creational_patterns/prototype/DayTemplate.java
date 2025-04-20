package creational_patterns.prototype;

public class DayTemplate extends AttendanceRecordTemplate {
    public DayTemplate() {
        recordType = "Full Day";
        formatDescription = "Mark attendance for the day.";
    }

    public void applyTemplate() {
        System.out.println("Applying a school Day attendance format");
    }
}
