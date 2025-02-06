class SwapDemo {
	void swapnumbers() {
		int a = 300, b = 400;
		System.out.println("Before Swap a = "+a +" b = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap a = "+a +" b = "+b);		
	}
}

public class Demo015 {
    public static void main(String[] args){
        SwapDemo obj = new SwapDemo();
        obj.swapnumbers();
}
}
