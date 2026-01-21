package Vector;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(12);
		s.push(11);
		s.push(14);
		s.push(31);
		
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(16);
		s1.push(15);
		s1.push(10);
		s1.push(30);
		
		
		
		System.out.println(s);
		
		//peek
		System.out.println(s.peek());
		
		//pop
		System.out.println(s.pop());
		
		//Adding s1 into s
		s.addAll(s1);
//		
//		//removeAll from s
		
		s.removeAll(s1);
		
		s.retainAll(s1);
		
		s.clear();
		
		//printing the s
		System.out.println(s);
		
	}

}
