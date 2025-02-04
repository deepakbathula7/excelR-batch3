package Demo_java;

import java.util.Scanner;

public class Demo009 {
    String custName = "Deepak";
    long accountNo = 436286456; 
    Double balance = 1000000.00; 

    void acceptDetails() {
        System.out.println("Enter your name and account number:");
        Scanner sc = new Scanner(System.in);
        custName = sc.nextLine();
        accountNo = sc.nextLong();
        sc.nextLine(); 
        sc.close();
    }

    void displayDetails() {
        System.out.println("Hello " + custName);
        System.out.println("Your balance is " + balance);
    }

    public static void main(String[] args) {
        Demo009 obj = new Demo009(); 
        obj.acceptDetails(); 
        obj.displayDetails(); 
    }
}
