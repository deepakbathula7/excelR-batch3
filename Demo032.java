

import java.util.HashSet;
class HashSetDemo2 {

    void HashsetMethod(){
        HashSet <String>hashSet = new HashSet<String>();
		hashSet.add("INDIA");
		hashSet.add("AUSTRALIA");
		hashSet.add("BANGLADESH");
		hashSet.add("CHINA");
		hashSet.add("DUBAI");
		hashSet.add("INDIA");
		System.out.println(hashSet);
    }
	
}

public class Demo032 {
    public static void main(String[] args) {
		HashSetDemo2 obj = new HashSetDemo2();
        obj.HashsetMethod();
	}
}