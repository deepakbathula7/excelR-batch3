class PalindromeOf3 {
	boolean isPalindromeOf3Digits(int n){
		return (n/ 100) == (n % 10);
	}
}
public class Demo016 {
    public static void main(String[] args) {
        PalindromeOf3 obj = new PalindromeOf3();
		int n = 131;	
		System.out.println(obj.isPalindromeOf3Digits(n));
	}
}
