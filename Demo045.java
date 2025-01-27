import java.util.Scanner;

class Demo045{
    public static void main(String[] args){
        
        System.out.println("Enter the values of x and y: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if((x>=0 && y>=0) && (x != 0 && y!=0)){
            x= x+y;
            y = x-y;
            x = x-y;

            System.out.println("Result after swapping the values: ");
            System.out.print(" x: "+x);
            System.out.println(" y: "+y);
        }
        sc.close();
    }
}