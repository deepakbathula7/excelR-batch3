public class Demo060 {
    public static void main(String[] args){
        int a = 20;
        Fibo obj = new Fibo();
        obj.fib(a);
    }
}
class Fibo{
    void fib(int num){
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for(int i = 2; i < num; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}