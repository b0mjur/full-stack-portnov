package src.Session7.SMS;

public class Student {

    int studentId;
    String firstName;
    String lastName;
    int studentAge;
    String major;

    Student(int id, String fName, String lName, int Age, String major) {
        this.studentId = id;
        this.firstName = fName;
        this.lastName = lName;
        this.studentAge = Age;
        this.major = major;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, First Name: %s, Last Name: %s, Major: %s",
                studentId, firstName, lastName, major);
    }
}


