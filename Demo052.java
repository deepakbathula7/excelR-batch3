import java.util.Scanner;

class Demo052{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of x: ");
        int x = sc.nextInt();
        Demo052 obj = new Demo052();
        boolean a = obj.isArmstrong(x);
        if(a){
            System.out.println("The given number is an Armstrong number.");
        }
        else{
            System.out.println("The given number is not an Armstrong number.");
        }
    }  
    boolean isArmstrong(int x){
        int sum = 0;
        int temp = x;
        while(x != 0){
            int rem = x%10;
            sum = sum + rem*rem*rem;
            x = x/10;
        }
        if(temp == sum){
            return true;
        }
        else{
            return false;
        }
    }
    
}