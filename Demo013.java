class TriangleAreaDemo1 {

	double getTriangleArea(int s1,int s2,int s3){
		double s = (s1 + s2 + s3) / 2;
		double ta = Math.sqrt(s * (s - s1) * (s - s2) * (s-s3));
		return ta;
	}
	
}
public class Demo013{
    public static void main(String[] args) {
		int s1 = 5, s2 = 6, s3 =7;		
        TriangleAreaDemo1 ta = new TriangleAreaDemo1();
        ta.getTriangleArea(s1, s2, s3);
		
		System.out.println("The triangle area is : " + ta);
	}
}
