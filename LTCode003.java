public class LTCode003 {
    // Your existing myAtoi method
    public int myAtoi(String s) {
        // Step 1: Trim leading whitespaces
        s = s.trim();
        
        // Step 2: If the string is empty after trimming, return 0
        if (s.isEmpty()) {
            return 0;
        }
        
        // Step 3: Handle the sign
        int sign = 1;
        int index = 0;
        
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }
        
        // Step 4: Convert the digits
        int num = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            // Check for overflow before multiplying by 10
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            num = num * 10 + digit;
            index++;
        }
        
        // Step 5: Apply the sign and return the result
        num *= sign;
        
        // Step 6: Handle overflow
        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        
        return num;
    }

    // Main method to test the myAtoi function
    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();

        // Test cases
        System.out.println(solution.myAtoi("42"));              // Output: 42
        System.out.println(solution.myAtoi(" -042"));           // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));        // Output: 1337
        System.out.println(solution.myAtoi("0-1"));             // Output: 0
        System.out.println(solution.myAtoi("words and 987"));   // Output: 0
    }
}
