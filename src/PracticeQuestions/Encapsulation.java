package PracticeQuestions;

public class Encapsulation {
	private int marks;
	Encapsulation() {
	}
	
	Encapsulation(int marks){
		if(marks>100){
			System.out.println("Invalid marks");
			return;
		}
		this.marks=marks;
	}
	public void setMarks(int marks) {
		if(marks>100){
			System.out.println("Invalid marks");
			return;
		}
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	public static void main(String args[]) {
		Encapsulation st = new Encapsulation(104);
//		st.setMarks(123);
		System.out.println(st.getMarks());
	}

}
