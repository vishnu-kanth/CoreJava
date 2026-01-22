package CollectionPractice;
import java.util.*;


public class Arraylists {
	public static void main(String[] args) {
		
	ArrayList<Integer> Marks = new ArrayList<>();
	Marks.add(100);
	Marks.add(99);
	Marks.add(91);
	Marks.add(99);
	Marks.add(97);
	Marks.add(98);
	
	System.out.println(Marks);
	
	//get for index 
	System.out.println(Marks.get(2));
	
	//remove
	
	System.out.println(Marks.remove(4));
	System.out.println(Marks);
	
	
	//2
	ArrayList<String> items = new ArrayList<>();
	items.add("Laptop");
	items.add("Mouse");
	items.add("Keyboard");
	items.add("Mouse");
	
	System.out.println(items);
	
	System.out.println(items.remove("Mouse"));
	System.out.println(items);
	
	System.out.println(items.contains("Keyboard"));
	System.out.println(items);
	
	LinkedList<String> coach = new LinkedList<>();
	coach.add("C1");
	coach.add("C2");
	coach.add("C3");
	
	System.out.println(coach);
	//add at starting
	coach.addFirst("Engine");
	coach.addLast("Guard");
	
	System.out.println(coach);
	
	System.out.println(coach.removeFirst());
	System.out.println(coach);
	
	LinkedList<String> Pages = new LinkedList<>();
	Pages.add("Google");
	Pages.add("Youtube");
	Pages.add("StackOverFlow");
	
	System.out.println(Pages);
	
	Pages.add(2, "ChatGPT");
	System.out.println(Pages);
	
	Pages.removeLast();
	System.out.println(Pages);
	
	HashSet<Integer> roll = new HashSet<>();
	roll.add(101);
	roll.add(102);
	roll.add(103);
	roll.add(101);
	
	System.out.println(roll);
	
	roll.contains(102);
	System.out.println(roll);
	
	roll.remove(103);
	System.out.println(roll);
	
	HashSet<String> email = new HashSet<>();
	email.add("vishnu@gmail.com");
	email.add("varun@gmail.com");
	email.add("rishi@gmail.com");
	email.add("varun@gmail.com"); 
	
	System.out.println(email);
	
	HashMap<String,String> Contacts = new HashMap<>();
	
	Contacts.put("Ravi", "9999");
	Contacts.put("Nani", "8888");
	Contacts.put("Ravi", "7777");
	
	System.out.println(Contacts);
	
	System.out.println(Contacts.get("Nani"));
	System.out.println(Contacts.remove("Ravi"));
	
	System.out.println(Contacts);
	
	}
}
