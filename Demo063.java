public class Demo063 {
    // program for finding the sum of 1st  and last element of the array

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 }; // 5 op : 80
        int sum = 0;
        int n = arr.length;
        
        sum += arr[0] + arr[n - 1];
        System.out.println("Sum of first and last element of array is: "+sum);
        
    }
}