import java.util.Scanner;
public class Demo037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int d = sc.nextInt();
        if(a>b && a>c && a>d){
            System.out.println(a+" is greater than "+b+ " and "+c+" and "+d);
        }else if(b>a && b >c && b>d){
            System.out.println(b+" is greater than "+a+" and "+c+" and "+d);
        }else if(c>a && c>b && c>d){
            System.out.println(c+" is greater than "+a+" and "+b+" and "+d);
        }else{
            System.out.println(d+" is greater than "+a+" and "+b+" and "+c);
        }
    }
}