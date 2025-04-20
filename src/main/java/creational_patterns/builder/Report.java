package creational_patterns.builder;

public class Report {

    private int reportId;
    private String studentName;
    private String classGroupId;
    private String attendancePercentage;
    private String remarks;

    private Report(ReportBuilder builder) {
        this.reportId = builder.reportId;
        this.studentName = builder.studentName;
        this.classGroupId = builder.classGroupId;
        this.attendancePercentage = builder.attendancePercentage;
        this.remarks = builder.remarks;
    }

    public void display() {
        System.out.println("Report ID: " + reportId);
        System.out.println("Student: " + studentName);
        System.out.println("Class Group ID: " + classGroupId);
        System.out.println("Attendance: " + attendancePercentage);
        System.out.println("Remarks: " + remarks);
    }

    public static class ReportBuilder {
        private int reportId;
        private String studentName;
        private String classGroupId;
        private String attendancePercentage;
        private String remarks;

        public ReportBuilder setReportId(int reportId) {
            this.reportId = reportId;
            return this;
        }

        public ReportBuilder setStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public ReportBuilder setClassGroupId(String classGroupId) {
            this.classGroupId = classGroupId;
            return this;
        }

        public ReportBuilder setAttendancePercentage(String attendancePercentage) {
            this.attendancePercentage = attendancePercentage;
            return this;
        }

        public ReportBuilder setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}
