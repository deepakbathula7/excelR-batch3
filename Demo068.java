public class Demo068 {
 
    public static void main(String[] args) {
        int [] arr ={12,20,30,45,11};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 ==0){
                count ++;
            }
           
        }
        System.out.println("the final count of the even numbers in an array: "+count);
    }
}