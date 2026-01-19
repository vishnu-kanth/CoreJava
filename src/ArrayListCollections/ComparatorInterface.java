package ArrayListCollections;
import java.util.*;

public class ComparatorInterface {

    // Comparable implementation
    static class Book implements Comparable<Book> {
        int price;

        Book(int price) {
            this.price = price;
        }

        @Override
        public int compareTo(Book b) {
            return this.price - b.price;
        }

        @Override
        public String toString() {
            return "Price: " + price;
        }
    }

    // Comparator implementation
    static class PriceDescendingComparator implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2) {
            return b2.price - b1.price; // descending order
        }
    }

    public static void main(String[] args) {

        ArrayList<Book> l1 = new ArrayList<>();

        l1.add(new Book(1000));
        l1.add(new Book(10));
        l1.add(new Book(200));
        l1.add(new Book(2500));

        System.out.print("Original List:  ");
        System.out.println(l1);

        // Using Comparable
        Collections.sort(l1);
        System.out.print("Sorted using Comparable (Ascending):  ");
        System.out.println(l1);

        // Using Comparator
        Collections.sort(l1, new PriceDescendingComparator());
        System.out.print("Sorted using Comparator (Descending):  ");
        System.out.println(l1);
    }
}