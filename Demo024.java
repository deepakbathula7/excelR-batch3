
import java.util.Scanner;

public class Demo024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = new String[10];
        System.out.println("Enter the names of 10 friends:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of friend " + (i + 1) + ": ");
            friends[i] = sc.nextLine();
        }

        System.out.println("\nHere are the names of your 10 friends:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Friend " + (i + 1) + ": " + friends[i]);
        }

        sc.close();
    }
}