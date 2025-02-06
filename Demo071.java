import java.util.Arrays;

class Demo071{
    public static void main(String[] args){
        int [] arr = {12,20,30,43,11,10};
        Rev re = new Rev();
        arr = re.reverse(arr);
        System.out.println("Reversed array is: "+Arrays.toString(arr));
    }
}
class Rev{
    int[] reverse(int[] arr){
        int n = arr.length;
        int[] rev = new int[n];
        for(int i = 0;i<n;i++){
            rev[i] = arr[n-i-1];
        }
        return rev;
    }
}