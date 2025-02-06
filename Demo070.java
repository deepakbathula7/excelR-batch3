class Demo070{
    public static void main(String[] args) {
        int[] arr = {12,20,30,43,11,10};
        
        System.out.println("Prime numbers in the array are: ");
        prime(arr);
    }
    static void prime(int[] arr){
        int i;
        for(int n:arr){
            if(n==0 || n==1){
                continue;
            }
            for(i = 2;i<n;i++){
                if(n%i==0){
                    break;
                }
                if(i==n-1){
                    System.out.println(n);
                }
            }
        }
    }
}