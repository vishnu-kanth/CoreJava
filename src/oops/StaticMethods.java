package oops;

public class StaticMethods {
	public static void m1() {
		System.out.println("Static Method");
	}
	public static void main(String args[]) {
		m1();
		StaticMethods.m1();
	}
}
