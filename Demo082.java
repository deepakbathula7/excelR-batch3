import java.util.Scanner;
public class Demo082 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of arr1: ");
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        System.out.println("Enter elements arr1: ");
        
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of arr2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements arr2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int mSize = arr1.length + arr2.length;
        int[] merged = new int[mSize];

     
        for (int i = 0; i < arr1.length; i++) { 
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) { 
            merged[arr1.length + i] = arr2[i];
        }

        
        System.out.println("Merged array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }


        sc.close();
    }
}