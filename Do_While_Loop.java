import java.util.Scanner;
public class Do_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username,pass;
        do{
            System.out.println("Welcome to Mallareddy University, please login");
            System.out.println("Enter Name:");
            username = sc.next();
            System.out.println("Enter Password:");
            pass = sc.next();
        } while((!username.equals("Aravind")) || (!pass.equals("Aravind_01")));
    }
}