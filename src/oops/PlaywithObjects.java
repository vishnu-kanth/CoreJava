package oops;

class Box {

}

class Bottle {

}

public class PlaywithObjects {
	public static void main(String[] args) {
		Box b1 = new Box();
		printRef(b1);
		Bottle a1 = new Bottle();
		printRef(a1);
	}

	public static void printRef(Box b) {
		System.out.println(b);
	}

	public static void printRef(Bottle b) {
		System.out.println(b);
	}
}
