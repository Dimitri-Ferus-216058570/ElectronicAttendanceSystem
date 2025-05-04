package org.example.creational_patterns.prototype;

public abstract class AttendanceRecordTemplate implements Cloneable {
    protected String recordType;
    protected String formatDescription;

    abstract void applyTemplate();

    public String getRecordType() {
        return recordType;
    }

    public String getFormatDescription() {
        return formatDescription;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
