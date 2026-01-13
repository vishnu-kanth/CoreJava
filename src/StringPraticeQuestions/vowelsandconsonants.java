package StringPraticeQuestions;

public class vowelsandconsonants {
	public static void main(String[] args) {
		String s = "Vishnu";
		int vol = 0;
		int con = 0;
		s = s.toLowerCase();
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vol++;
			} else {
				con++;
			}
		}
		System.out.println(vol + " " + con);
	}

}
