package src.Session7.SMS;

public class Student {

    int studentId;
    String firstName;
    String lastName;
    int studentAge;
    String major;

    static int studentCount = 0;
    static int newStudentId = 1;

    Student(String fName, String lName, int Age, String major) {
        validateAge(Age);
        validateMajor(major);
        this.studentId = newStudentId++;
        this.firstName = fName;
        this.lastName = lName;
        this.studentAge = Age;
        this.major = major;
        studentCount++;
    }

    static void validateAge(int age) {
        if (age < 18 || age > 150) {
            throw new IllegalArgumentException("Age must be between 18 and 150");
        }
    }

    static void validateMajor(String major) {
        if (!major.equals("Art") && !major.equals("Economics") && !major.equals("Math")) {
            throw new IllegalArgumentException("Major must be Art, Economics, or Math");
        }
    }

    int getStudentId() {
        return studentId;
    }

    String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        validateAge(studentAge);
        this.studentAge = studentAge;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        validateMajor(major);
        this.major = major;
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