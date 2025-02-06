public class Demo064 {
    public static void main(String[] args) {
        int [] arr ={12,20,30,45,11};
        int n = arr.length;

        System.out.println("Before swapping: \nfirst element "+arr[0]+" last element "+arr[n-1]);
        arr[0]=arr[0]+arr[n-1];
        arr[n-1]=arr[0]-arr[n-1];
        arr[0]=arr[0]-arr[n-1];
        System.out.println("After swapping: \nfirst element "+arr[0]+" last element "+arr[n-1]);

        
    }
}