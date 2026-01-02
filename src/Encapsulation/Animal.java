package Encapsulation;

public class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Animal a1 = new Animal("Dog");
		Animal a2 = a1;
		System.out.println(a2.name);
		System.out.println(a1.name);
		
		a2.name = "cat";
		System.out.println(a1.name);
		System.out.println(a2.name);
		
	}
}
