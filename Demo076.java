import java.util.*;

class Demo076{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Demo076 obj = new Demo076();
        if(obj.secMax(arr)!=-1){
            System.out.println("Second max of an array: "+obj.secMax(arr));
        }else{
            System.out.println("Invalid array");
        }
    }
    public int secMax(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int n = arr.length;
        return arr[n-2];
        
    }
}