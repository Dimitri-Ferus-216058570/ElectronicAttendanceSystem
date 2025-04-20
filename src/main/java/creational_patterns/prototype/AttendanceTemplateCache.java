package creational_patterns.prototype;

public class AttendanceTemplateCache {
    private static final java.util.Map<String, AttendanceRecordTemplate> templateMap = new java.util.HashMap<>();

        public static AttendanceRecordTemplate getTemplate(String templateId) {
            return (AttendanceRecordTemplate) templateMap.get(templateId).clone();
        }

        public static void loadCache() {
            DayTemplate full = new DayTemplate();
            templateMap.put("full", full);

        }
}
