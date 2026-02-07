package Streams;

import java.util.*;


public class Sort {
	public static void main(String args[]) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		
		l.stream()
		.filter(x->x%2==0)
		.sorted()
		.forEach(System.out::println);
	}

}
