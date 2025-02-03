import java.util.Scanner;
public class Demo008 {
    public static void main(String[] args) {
        String name;
        int age;
        long phno;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name: ");
        name = sc.nextLine();
        System.out.println("please enter yoyr age: ");
        age = sc.nextInt();
        System.out.println("please enter your phone number: ");
        phno = sc.nextLong();
        System.out.println("Hello "+name+" your age is "+age+" your phone nmber is "+phno);
    }
}
