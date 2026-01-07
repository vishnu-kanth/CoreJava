package polymorphism;

public class MethodOverriding {
	
	static class Animal{
		void walk() {
			System.out.println("Animal is walking");
		}
		void sound() {
			System.out.println("Animal is making sounds");
		}
	}
	
	static class Dog extends Animal{
		void sound() {
			System.out.println("Dog is making sound Bow Bow...");
		}
	}
	static class Cat extends Animal{
		void sound() {
			System.out.println("Cat is making sound Meow Meow...");
		}
	}
		public static void main(String args[]) {
			Animal a = new Animal();
	
			a.sound();
			a.walk();
			
			Animal d = new Dog();
			d.sound();
			d.walk();
			
			Animal c = new Cat();
			c.sound();
			c.walk();
		}
}
