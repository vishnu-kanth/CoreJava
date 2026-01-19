package ArrayListCollections;

import java.util.*;

public class ComparableInterface {
	static class Book implements Comparable<Book> {
		int price;

		Book() {

		}

		Book(int price) {
			this.price = price;
		}

		public int compareTo(Book b) {
			return this.price - b.price;

		}

		public String toString() {
			return "Price: " + price;
		}
	}

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList<>();
		l1.add(new Book(1000));
		l1.add(new Book(1500));
		l1.add(new Book(2000));
		l1.add(new Book(2500));
		System.out.println(l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(l1);
	}
}
