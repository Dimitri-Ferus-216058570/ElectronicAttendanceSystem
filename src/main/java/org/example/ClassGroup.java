package org.example;

class ClassGroup {
    private int classGroupId;
    private String className;
    private String gradeId;
    private String teacherId;

    public ClassGroup(int classGroupId, String className, String gradeId) {
        this.classGroupId = classGroupId;
        this.className = className;
        this.gradeId = gradeId;
    }

    public int getClassGroupId() {
        return classGroupId;
    }

    public void setClassGroupId(int classGroupId) {
        this.classGroupId = classGroupId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}