package org.example;

import org.example.creational_patterns.abstract_factory.EmailNotification;
import org.example.creational_patterns.abstract_factory.EmailNotificationFactory;
import org.example.creational_patterns.abstract_factory.Notification;
import org.example.creational_patterns.abstract_factory.NotificationFactory;
import org.example.creational_patterns.builder.Report;
import org.example.creational_patterns.factory_method.*;
import org.example.creational_patterns.prototype.AttendanceRecordTemplate;
import org.example.creational_patterns.prototype.AttendanceTemplateCache;
import org.example.creational_patterns.simple_factory.AttendanceParent;
import org.example.creational_patterns.simple_factory.AttendanceTeacher;
import org.example.creational_patterns.simple_factory.AttendanceUser;
import org.example.creational_patterns.simple_factory.UserFactory;
import org.example.creational_patterns.singleton.DatabaseConnection;
import junit.framework.TestCase;
import org.junit.Test;

public class CreationalPatternsTests extends TestCase {

    @Test
    public void testSingleton() {
        DatabaseConnection con1 = DatabaseConnection.getInstance();
        DatabaseConnection con2 = DatabaseConnection.getInstance();
        assertSame("Both instances should be the same", con1, con2);
    }

    @Test
    public void testBuilder() {
        Report report = new Report.ReportBuilder()
                .setReportId(1)
                .setStudentName("John Doe")
                .setClassGroupId("Math1")
                .setAttendancePercentage("95%")
                .setRemarks("Excellent")
                .build();

        assertNotNull(report);
        report.display();
    }

    @Test
    public void testSimpleFactory() {
        AttendanceUser teacher = UserFactory.createUser("teacher");
        assertTrue(teacher instanceof AttendanceTeacher);

        AttendanceUser parent = UserFactory.createUser("parent");
        assertTrue(parent instanceof AttendanceParent);
    }

    @Test
    public void testFactoryMethod() {
        AttendanceMarkerFactory factory = new TeacherAttendanceFactory();
        AttendanceMarker marker = factory.createMarker();
        assertTrue(marker instanceof TeacherAttendanceMarker);

        factory = new AdminAttendanceFactory();
        marker = factory.createMarker();
        assertTrue(marker instanceof AdminAttendanceMarker);
    }

    @Test
    public void testAbstractFactory() {
        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        assertTrue(notification instanceof EmailNotification);

    }

    @Test
    public void testPrototype() {
        AttendanceTemplateCache.loadCache();

        AttendanceRecordTemplate day = AttendanceTemplateCache.getTemplate("full");
        assertNotNull(day);
        assertEquals("Full Day", day.getRecordType());

    }
}
