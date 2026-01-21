package ArrayListCollections;
import java.util.*;
public class PracticeQuestions {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(100);
		marks.add(98);
		marks.add(87);
		marks.add(72);
		marks.add(99);
		marks.add(89);
		
		
		System.out.println(marks);
		
		System.out.println(marks.get(2));
		System.out.println(marks);
		
		System.out.println(marks.remove(4));
		System.out.println(marks);
		
		ArrayList<String> items = new ArrayList<>();
		items.add("Mouse");
		items.add("Laptop");
		items.add("Keyboard");
		items.add("Mouse");
		
		System.out.println(items);
		
		System.out.println(items.remove("Mouse"));
		
		System.out.println(items);
		
		System.out.println(items.contains("Keyboard"));
		
		System.out.println(items);
		
	}

}
