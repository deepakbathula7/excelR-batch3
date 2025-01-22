class ReserveString {
	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);
		return out.toString();
	}
}
public class Demo022 {
    public static void main(String[] args) {
        ReserveString obj = new ReserveString();
		String str = "123";
		System.out.println(obj.reverse(str));
	}
}