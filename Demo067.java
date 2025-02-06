public class Demo067 {
 
    public static void main(String[] args) {
        int [] arr ={12,20,30,45,11};
        int n = arr.length;
        int count = 0;
        System.out.println("Even elements are: ");
        for (int i = 1; i < n; i++) {
            if(i % 2 ==0){
                System.out.println("arr["+(i)+"] : "+arr[i]);
            }
           
        }
        
    }
}