package src.Session7.SMS;
import java.util.Random;


public class Student {

    int studentId;
    String firstName;
    String lastName;
    int studentAge;
    String major;

    static int studentCount = 0;
    static int newStudentId = 1;

    Student(String fName, String lName, int Age, String major) {

        this.studentId = newStudentId++;
        this.firstName = fName;
        this.lastName = lName;
        this.studentAge = Age;
        this.major = major;
        studentCount++;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, First Name: %s, Last Name: %s, Major: %s",
                studentId, firstName, lastName, major);
    }

    public static int getStudentCount() {
        return studentCount;
    }
}