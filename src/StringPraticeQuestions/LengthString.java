package StringPraticeQuestions;

public class LengthString {
	public static void main(String[] args) {
		
		String s = "Vishnu";
		int count =0;
		for(char c:s.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
