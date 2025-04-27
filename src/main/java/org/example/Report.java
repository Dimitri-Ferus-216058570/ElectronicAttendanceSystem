package org.example;

class Report {
    private int reportId;
    private int studentId;
    private String summary;

    public Report(int reportId, int studentId, String summary) {
        this.reportId = reportId;
        this.studentId = studentId;
        this.summary = summary;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void generateReport() {
        System.out.println("Generating report");
    }

    public void exportReport() {
        System.out.println("Exporting report");
    }

    public void viewGraph() {
        System.out.println("Display graph");
    }

    public void print() {
        System.out.println("Printing report");
    }
}
