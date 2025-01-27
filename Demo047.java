import java.util.Scanner;

class Demo047{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x: ");
        int x = sc.nextInt();
        Demo047 obj = new Demo047();
        int a = obj.count(x);
        System.out.println("The number of digits in the given number is: "+a);
    }
    int count(int x){
        int count = 0;
        while(x != 0){
            x = x/10;
            count++;
        }
        return count;
    }
}