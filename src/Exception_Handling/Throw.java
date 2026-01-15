package Exception_Handling;

import java.util.*;

public class Throw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value");
		int a = sc.nextInt();

		System.out.println("Enter the value");
		int b = sc.nextInt();

		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}

	}
}
