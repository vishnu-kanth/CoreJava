package Hashset;
import java.util.*;

public class Introduction {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        System.out.println(set);
        set.remove(20);
        System.out.println(set);
        System.out.println(set.contains(10));
	}

}
