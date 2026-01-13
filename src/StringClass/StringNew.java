package StringClass;

public class StringNew {
	public static void main(String[] args) {
	
	//here when we declare new string it's creates 2 seperate memories "string constant poll and heap"
	
	String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    System.out.println(s1==s2);
    
    System.out.println(s1.equals(s2));
	}
}
