package org.example.creational_patterns.abstract_factory;

public class EmailNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending Email notification");
        }

}
