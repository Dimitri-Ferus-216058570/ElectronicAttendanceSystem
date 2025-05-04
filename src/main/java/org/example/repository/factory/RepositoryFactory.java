package org.example.repository.factory;

import org.example.repository.*;
import org.example.repository.inmemory.*;
//import repository.*;
//import repository.inmemory.*;

public class RepositoryFactory {

    public static StudentRepository getStudentRepository(String storageType) {
        switch (storageType) {
            case "MEMORY": return new InMemoryStudentRepository();
            //case "DATABASE": return new DatabaseStudentRepository(); // Future
            //implementation
            default: throw new IllegalArgumentException("Invalid stor type");
        }
    }

    public static TeacherRepository getTeacherRepository(String storageType) {
        switch (storageType) {
            case "MEMORY": return new InMemoryTeacherRepository();
            //case "DATABASE": return new DatabaseStudentRepository(); // Future
            //implementation
            default: throw new IllegalArgumentException("Invalid stor type");
        }
    }

    public static AdministratorRepository getAdministratorRepository(String storageType) {
        switch (storageType) {
            case "MEMORY": return new InMemoryAdministratorRepository();
            //case "DATABASE": return new DatabaseStudentRepository(); // Future
            //implementation
            default: throw new IllegalArgumentException("Invalid stor type");
        }
    }

    public static ParentRepository getParentRepository(String storageType) {
        switch (storageType) {
            case "MEMORY": return new InMemoryParentRepository();
            //case "DATABASE": return new DatabaseStudentRepository(); // Future
            //implementation
            default: throw new IllegalArgumentException("Invalid stor type");
        }
    }

    public static UserRepository getUserRepository(String storageType) {
        switch (storageType) {
            case "MEMORY": return new InMemoryUserRepository();
            //case "DATABASE": return new DatabaseStudentRepository(); // Future
            //implementation
            default: throw new IllegalArgumentException("Invalid stor type");
        }
    }
}
