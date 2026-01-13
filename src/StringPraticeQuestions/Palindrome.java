package StringPraticeQuestions;

public class Palindrome {
	public static void main(String[] args) {

		String n = "madam";
		String rev = "";
		for (int i = n.length() - 1; i >= 0; i--) {
			rev += n.charAt(i);
		}
		System.out.println(n.equals(rev));
	}
}
