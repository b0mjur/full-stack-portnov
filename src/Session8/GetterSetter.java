package src.Session8;

public class GetterSetter {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName());
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName == " ") {
            System.out.println("First name cannot be empty");
        } else {
            this.firstName = firstName;
        }
    }
}
