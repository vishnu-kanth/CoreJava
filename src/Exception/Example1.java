package Exception;
import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a Value");

		int a = sc.nextInt();
		System.out.println("Enter the b Value");
		
		int b = sc.nextInt();
		System.out.println(a/b);
		
		//NullPointer
		
		String s = null;
		System.out.println(s.toUpperCase());
		
		//NumberFormatException
		
		
		int a1 = Integer.parseInt("123abc");
		System.out.println(a1);
		
		//StringIndexOutOfboundException
		
		String s1 = "Vishnu";
		System.out.println(s1.charAt(7));
	}

}
