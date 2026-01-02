package oops;

public class Demo {
	{
		System.out.println("Hii.. I am from non-static block");
	}
	Demo(){
		System.out.println("Hii.. I am from constructor");
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}
