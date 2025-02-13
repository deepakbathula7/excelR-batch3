import java.util.Scanner;

public class Demo075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxIndex = 0; // initializing the pointer
        for (int i = 1; i < n; i++) { //// leaving a value(index) and performing general looping over the array
            if (arr[i] > arr[maxIndex]) { // for general comparision b/w the values
                maxIndex = i; // whatever the max value it points to that value
            }
        }

        int max = arr[maxIndex]; //external storage

        System.out.println("Max number is: " + max);
        sc.close();
    }
}