class StringContainsVowels {	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".[aeiou].");
	}
}
public class Demo023 {
    public static void main(String[] args) {
        StringContainsVowels obj = new StringContainsVowels();
		System.out.println(obj.stringContainsVowels("Hello")); // true
		System.out.println(obj.stringContainsVowels("TV")); // false
	}
}