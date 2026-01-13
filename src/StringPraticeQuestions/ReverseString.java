package StringPraticeQuestions;

public class ReverseString {
	public static void main(String[] args) {

		String n = "Hello";
		String rev = "";
		for (int i = n.length()-1;i >=0;i--) {
			rev +=n.charAt(i);
		}
		System.out.println(rev);
	}
}
