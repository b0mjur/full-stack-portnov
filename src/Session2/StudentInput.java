package src.Session2;

import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputDetails();
        student.displayDetails();
    }
}
 class Student {
    int id;
    String firstName;
    String lastName;
    int age;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Student ID: ");
        id = scanner.nextInt();
        System.out.println("Enter your first name: ");
        firstName = scanner.next();
        System.out.println("Enter your last name: ");
        lastName = scanner.next();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
    }
    public void displayDetails() {
        System.out.println("\n ====== Student Details ======");
        System.out.println("Student ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
