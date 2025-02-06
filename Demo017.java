public class Demo017 {

    public static void main(String[] args) {
        // Test cases
        System.out.println(getFizzBizz(33));  
        System.out.println(getFizzBizz(5));   
        System.out.println(getFizzBizz(15));  
        System.out.println(getFizzBizz(7));  
        System.out.println(getFizzBizz(-5));  
        System.out.println(getFizzBizz(0));   
    }

    public static String getFizzBizz(int number) {
        if (number <= 0) {
            return "Error";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBIZZ";
        } else if (number % 3 == 0) {
            return "FIZZ";
        } else if (number % 5 == 0) {
            return "BIZZ";
        } else {
            return String.valueOf(number);
        }
    }
}
