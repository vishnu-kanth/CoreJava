package CollectionsFramework;
import java.util.*;
public class Removecollection {
	public static void main(String[] args) {
		List<Integer>list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		List<Integer>list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(70);
		list2.add(80);
		
		//remove by index number
		list1.remove(1);
		System.out.println(list1);
		
		//removeAll - it removes duplicate elements
		list1.removeAll(list2);
		System.out.println(list1);
		
		//retainAll - it removes unique elements and keep duplicate
		list1.retainAll(list2);
		System.out.println(list2);
		
		//clear - its clears everything from collection
		list1.clear();
		System.out.println(list1);
		
		list2.remove(1);
		
		System.out.println(list2);
		
	}
}
