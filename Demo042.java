import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lower case char: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            
            ch = Character.toUpperCase(ch);
            System.out.println("The upper-case converted char is: " + ch);
        }
         else {
            System.out.println("unsuitable input");
        }

        scanner.close();
    }
}