import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        if (Character.isUpperCase(character)) {
            System.out.println("The character " + character + " is an uppercase letter.");
        } else if (Character.isLowerCase(character)) {
            System.out.println("The character " + character + " is a lowercase letter.");
        } else if(Character.isDigit(character)) {
            System.out.println("The character " + character + " is a digit.");
        } else {
            System.out.println("The character " + character + " is a special character.");
        }
    }
}