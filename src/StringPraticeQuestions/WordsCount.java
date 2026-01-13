package StringPraticeQuestions;

public class WordsCount {
	public static void main(String[] args) {
		String s = "Yalamakuri Vishnu Kanth";
		String[] arr = s.trim().split("\\s+");
		System.out.println(arr.length);
	}

}
