package org.example.creational_patterns.abstract_factory;

public class EmailNotificationFactory implements NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}
