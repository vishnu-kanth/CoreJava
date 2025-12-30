package Encapsulation;

public class OuterClass {
	static class Inner{
		static void display() {
			System.out.println("Static-Method");
		}
		void test() {
			System.out.println("Non - static Method");
		}
	}
	public static void main(String args[]){
		
//It is static we called directly
		OuterClass.Inner.display();
		
		
//This one is non-static that's why we created object and calling the test
		OuterClass.Inner e1 = new OuterClass.Inner();
		e1.test();	
	}
}
