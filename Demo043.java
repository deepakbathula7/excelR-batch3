import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a upper case char: ");
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch = Character.toLowerCase(ch);
            System.out.println("The lower-case converted char is: " + ch);
        } else {
            System.out.println("unsuitable input");
        }

        scanner.close();
    }
}