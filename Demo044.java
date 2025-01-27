import java.util.Scanner;

public class Demo044 {
    public static void main(String[] args) {
        int temp =0;
        System.out.println("Enter the values of x and y: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        if((x>=0 && y>=0) && (x != 0 && y!=0 )){
                   temp = x ;
                   x = y;
                   y = temp;

                   System.out.println("Result after swapping the values: ");
                   System.out.print(" x: "+x);
                   System.out.println(" y: "+y);

        }
        sc.close();
    }
}