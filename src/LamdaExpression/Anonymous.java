package LamdaExpression;

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Vishnu");
	}

}

public class Anonymous {

	public static void main(String args[]) {
		Student a = new Student("Vishnu") {
			public void display() {
				System.out.println("Hello...");
			}
		};
		a.display();
	}
}
