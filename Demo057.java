public class Demo057 {
    public static void main(String[] args) {
        int number = 12345;
        SumOfFirstAndLastDigits obj = new SumOfFirstAndLastDigits();
        int sum = obj.sumOfFirstAndLastDigits(number);
        System.out.println("Sum of first and last digits: " + sum);
    }
}

class SumOfFirstAndLastDigits {
    public static int sumOfFirstAndLastDigits(int number) {
        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        return firstDigit + lastDigit;
    }
}