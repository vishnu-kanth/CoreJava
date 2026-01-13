package StringPraticeQuestions;

public class NoofChar {
	public static void main(String[] args) {
		String n = "Vishnu Kanth";
		int count = 0;
		for (char ch : n.toCharArray()) {
			if (ch != ' ')
				count++;
		}
		System.out.print(count);
	}
}
