
    class SumOf2Digits {
        public static int getSumOf2Digits(int n){
            int fd = n / 10;
            int ld = n % 10;
            int sum = fd + ld;
            return sum;
        }
    }
    
    public class Demo020 {
        public static void main(String[] args) {
            SumOf2Digits obj = new SumOf2Digits();
            int n = 78;
            int sum = obj.getSumOf2Digits(n);
            System.out.println("The sum of 2 digits is : "+sum);
        }
    }
    
