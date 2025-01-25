import java.util.*;

class Prime{
    int flag = 0;
    void prime(int n){
        if(n==1){
            System.out.println("Prime");
            return;
        }
        for(int i =1;i<n;i++){
            if(n%i==0){
                flag++;
            }
        }
        if(flag==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}

class Demo027{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Prime p = new Prime();
        p.prime(n);
    }
}