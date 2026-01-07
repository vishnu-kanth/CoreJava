package polymorphism;

public class Runtime {
	static class run{
		public void displayrun() {
			System.out.println("Vehicle is ready to run...");
		}
	}
	
	static class Car extends run{
		public void displayrun() {
			System.out.println("Car is running");
		}
	}
	static class Bike extends run{
		public void displayrun() {
			System.out.println("Bike is running..");
		}
	}
	
	public static void main(String args[]) {
		Car v1 = new Car();
		Bike v2 = new Bike();
		
		v1.displayrun();
		v2.displayrun();
	}

}
