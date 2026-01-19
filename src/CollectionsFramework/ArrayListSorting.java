package CollectionsFramework;
import java.util.*;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(12);
		l1.add(13);
		l1.add(18);
		l1.add(16);
		System.out.println("====Before Sorting====");
		System.out.println(l1);
		Collections.sort(l1);
		
		System.out.println("====After Sorting====");
		System.out.println(l1);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
	}
}
