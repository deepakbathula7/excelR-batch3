import java.util.Arrays;

public class Demo18 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFibonacciSeries(4))); 
        System.out.println(Arrays.toString(getFibonacciSeries(7))); 
        System.out.println(Arrays.toString(getFibonacciSeries(0))); 
        System.out.println(Arrays.toString(getFibonacciSeries(-3))); 
    }

    
    public static int[] getFibonacciSeries(int numTerms) {
        if (numTerms <= 0) {
            return new int[]{0};
        }

        int[] fibonacciSeries = new int[numTerms];

        for (int i = 0; i < numTerms; i++) {
            if (i == 0) {
                fibonacciSeries[i] = 0;
            } else if (i == 1) {
                fibonacciSeries[i] = 1;
            } else {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }
        }

        return fibonacciSeries;
    }
}