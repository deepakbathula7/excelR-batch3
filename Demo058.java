public class Demo058 {
    public static void main(String[] args) {
        int number = 28;
        System.out.println("Factors of " + number + " are:");
        Factors obj = new Factors();
        obj.calculateFactors(number);
    }
}
class Factors{
    public void calculateFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}