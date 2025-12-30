package Encapsulation;

public class Product {
	private int price;
	
//Setter
	public void SetPrice(int price) {
		if(price>=0) {
			this.price = price;
		}
	}
//getter
	public int getPrice() {
		return price;
	}
}
