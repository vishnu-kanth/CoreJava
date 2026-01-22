package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Example {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		// stream
		al.stream().forEach(System.out::println);

		List<String> names = Arrays.asList("Vishnu", "Varun", "Sai"); // size is fixed so we can't add any elements
		names.stream().forEach(System.out::println);

		// count()
		long count = names.stream().count();
		System.out.println(count);

		// filter()
		
		names.stream()
		.filter(s->s.length()>5)
		.forEach(System.out::println);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//adding stream
		
		num.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		//map
		List<Integer> doubled = num.stream()
		.map(n->n*2)
		.collect(Collectors.toList());
		System.out.println(doubled);
		
		List<String> namesUpperList = names.stream()
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		namesUpperList.stream().forEach(System.out::println);
		System.out.println(namesUpperList);
		

	}
}
