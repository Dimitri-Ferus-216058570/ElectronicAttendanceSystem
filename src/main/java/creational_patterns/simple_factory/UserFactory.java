package creational_patterns.simple_factory;

public class UserFactory {

    public static AttendanceUser createUser(String role) {

        switch (role.toLowerCase()) {
            case "student":
                return new AttendanceStudent();
            case "teacher":
                return new AttendanceTeacher();
            case "parent":
                return new AttendanceParent();
            case "administrator":
                return new AttendanceAdministrator();
            default:
                throw new IllegalArgumentException("Unknown user role");
        }
    }
}
