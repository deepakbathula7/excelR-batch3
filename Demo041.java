import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a char: ");
        char ch = scanner.next().charAt(0);

   
        ch = Character.toLowerCase(ch);

     
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println( " is a vowel.");


        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(" is a consonant.");
        } else {
            System.out.println(" is not a valid alphabet ");
        }

     
        scanner.close();
    }
}