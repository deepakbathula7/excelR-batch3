
//Code for linked HashSet - 
// also use for each and iterator
import java.util.Iterator;
import java.util.LinkedHashSet;
class LinkedHashSetDemo{
    void linkedHashsetMethod(){
        LinkedHashSet <Integer>lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(30);
        lhs.add(60);
        lhs.add(80);
        System.out.println(lhs);
        lhs.remove(30);

        //forEach loop: It is optimized for Collections and Arrays
		int sum=0;
		for(Integer x : lhs) {
			sum += x;
		}

		System.out.println("The sum is :" + sum);

		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashsetMethod();
    }
}