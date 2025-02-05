class Demo061{
    public static void main(String[] args){
        int a = 10;
        PrimeTill obj = new PrimeTill();
        obj.primeTill(a);
    }
}

class PrimeTill{
    void primeTill(int num){
        int a = 1;
        int count = 0;
        while(count < num){
            if(isPrime(a)){
                System.out.println(a);
                count++;
            }
            a++;
            
        }
    }
    static boolean isPrime(int n) {
        if (n < 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}