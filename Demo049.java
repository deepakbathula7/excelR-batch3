import java.util.Scanner;

class Demo049{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the values of x: ");
        int x = sc.nextInt();
        Demo049 obj = new Demo049();
        int a = obj.rev(x);
        System.out.println("The reverse of the given number is: "+a);
    }
    int rev(int x){
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return rev;
    }
}