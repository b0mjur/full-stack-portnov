package src.Session7.SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("===== Student Menu =====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Display number of students");
            System.out.println("4. Delete student");
            System.out.println("5. Edit student");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    boolean idExists = false;
                    System.out.println("Enter student id: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        students.get(studentId);
                        idExists = true;
                        break;
                    } catch (IndexOutOfBoundsException e) {
                        idExists = false;
                    }
                    if (idExists) {
                        System.out.println("Student with id " + studentId + " already exists");
                        break;
                    }

                    System.out.println("Enter student first name: ");
                    String firstName = scanner.next();

                    System.out.println("Enter student last name: ");
                    String lastName = scanner.next();

                    System.out.println("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    if (studentAge < 18 || studentAge > 150) {
                        System.out.println("Invalid age. Age must be between 18 and 60");
                        scanner.nextLine();
                    }


                    System.out.println("Enter student major: ");
                    String major = scanner.nextLine();
                    boolean validMajor = false;
                    if (major.equalsIgnoreCase("Art") || major.equalsIgnoreCase("Economics") || major.equalsIgnoreCase("Math")) {
                        validMajor = true;
                    } else {
                        System.out.println("Invalid major. Major must be Art, Economics or Math");
                        scanner.nextLine();
                    }

                    Student student = new Student(firstName, lastName, studentAge, major);

                    students.add(student);

                    System.out.println("Information saved successfully" + student.toString());
                    break;
                case 2:
                    System.out.println("===== Student List =====");
                    System.out.printf("%-10s %-20s %-20s %-5s %-20s\n", "ID", "First Name", "Last Name", "Age", "Major");
                    System.out.println("---------------------------------------------------------");
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        System.out.printf("%-10d %-20s %-20s %-5d %-20s\n",
                                s.studentId,
                                s.firstName,
                                s.lastName,
                                s.studentAge,
                                s.major);
                    }
                    System.out.println("--------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Number of students: " + Student.getStudentCount());
                    break;
                case 4:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    idExists = false;
                    students.remove(id);
                    System.out.println("Student deleted successfully");
                    if (!idExists) {
                        System.out.println("Student with id " + id + " does not exist");
                    }
                    break;

                case 5:
                    System.out.println("Enter student id: ");
                    int idToEdit = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;
                    for (Student s : students) {
                        if (s.studentId == idToEdit) {
                            found = true;
                            System.out.println("Enter new first name: ");
                            s.firstName = scanner.next();
                            System.out.println("Enter new last name: ");
                            s.lastName = scanner.next();
                            System.out.println("Enter new age: ");
                            s.studentAge = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter new major: ");
                            s.major = scanner.nextLine();
                            System.out.println("Student edited successfully");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with id " + idToEdit + " not found");
                    }
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}