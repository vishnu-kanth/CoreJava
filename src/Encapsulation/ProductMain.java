package Encapsulation;

public class ProductMain {
	public static void main(String args[]) {
		Product p1 = new Product();
		p1.SetPrice(100);
		System.out.println(p1.getPrice());
	}
}
