package InheritancePraticeQuestions;

public class Multilevel {
	static class Animal{
		void eat() {
			System.out.println("Animal is Eating");
		}
	}
	static class mamal extends Animal{
		void walk() {
			System.out.println("Animal is Walking");
		}
	}
	static class Dog extends mamal{
		void bark() {
			System.out.println("Dog is Barking..");
		}
	}
	
	public static void main(String args[]) {
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.bark();
	}
}

