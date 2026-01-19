package LinkedList;
import java.util.*;

public class Introduction {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(12);
		l1.add(52);
		l1.add(42);
		l1.add(32);
		l1.add(22);
		l1.add("Hello");
		l1.add(null);
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		l2.add(12);
		l2.add(90);
		l2.add(13);
		l2.add(80);
		l2.add(14);
		
		System.out.println(l2);
		
		l1.addAll(3, l2);
		
//		System.out.println(l2);
//		
//		System.out.println(l1.contains(12));
//		System.out.println(l1.indexOf(52));
		
		for(Object o :l1) {
			System.out.print(" "+o );
		}
	}
}
