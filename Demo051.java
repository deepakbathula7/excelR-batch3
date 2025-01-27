import java.util.Scanner;

public class Demo051 {
    public boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        if(number<0){
            return false;
        }
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        Demo051 sol = new Demo051();
        boolean result = sol.isPalindrome(number);
        System.out.println(result==true?"Palindrome":"Not Palindrome");
        sc.close();
    }
}