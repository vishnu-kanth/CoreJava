package Exception_Handling;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(age<16 && age<41) {
			throw new UnderAgeException();
		}else {
			throw new OverAgeException();
		}
	}

}
