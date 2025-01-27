import java.util.Scanner;

class Demo048{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x: ");
        int x = sc.nextInt();
        Demo048 obj = new Demo048();
        int a = obj.addD(x);
        System.out.println("The sum of digits in the given number is: "+a);
    }
    int addD(int x){
        int sum = 0;
        while(x != 0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }
}