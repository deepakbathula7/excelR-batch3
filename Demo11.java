import java.util.Scanner;

public class Demo11 {
    private String name; // Changed to private for encapsulation
    private int age;     // Changed to private for encapsulation
    private String email; // Changed to private for encapsulation

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your email: ");
        email = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("\nDetails:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Demo11 demo = new Demo11();
        demo.acceptDetails();
        demo.displayDetails();
    }
}

class Student extends Demo11 {
    private String studentId;
    private String course;

    public void acceptDetails() {
        super.acceptDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your student ID: ");
        studentId = scanner.nextLine();

        System.out.print("Enter your course: ");
        course = scanner.nextLine();
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();
    }
}