package Demo_java;

import java.util.Scanner;

public class Demo007 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        String pwd = ""; // Initialize pwd
        String loginid = ""; // Initialize loginid
        String reply;

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited earlier? (yes/no)");
            reply = sc.nextLine();

            if (reply.equals("no")) {
                System.out.println("Login here");
                System.out.println("Enter your ID:");
                loginid = sc.nextLine();
                System.out.println("Enter your password:");
                pwd = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }
        } while (!(loginid.equals("Deepak") && pwd.equals("12345678")));
        System.out.println("Login successful!");
        sc.close();
    }
}
