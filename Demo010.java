import java.util.Scanner;

class Customer {
    private String name;
    private int accnumber;
    private double balance; 
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        name = sc.nextLine();
        System.out.println("Enter bank account number: ");
        accnumber = sc.nextInt();
        System.out.println("Enter the balance: ");
        balance = sc.nextDouble(); // Changed to nextDouble for balance
    }

    // Method to display customer details
    public void displayDetails() {
        System.out.println("\nDetails:");
        System.out.println("Name: " + name);
        System.out.println("Account number: " + accnumber);
        System.out.println("Balance: " + balance);
    }
}

public class Demo010 {
    public static void main(String[] args) {
        Customer person = new Customer(); // Changed to uppercase 'Customer'
        person.acceptDetails();
        person.displayDetails();
    }
}
