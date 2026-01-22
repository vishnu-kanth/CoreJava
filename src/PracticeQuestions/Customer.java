package PracticeQuestions;
import java.util.*;

class Student{
	private int id;
	private String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return "Id: "+id+" Name: "+name ;
	}
}

public class Customer {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1,"Vishnu"));
		studentList.add(new Student(2,"Sai"));
		studentList.add(new Student(2,"Varun"));
		
		studentList.stream().
		filter(s->s.getName()
		.startsWith("V"))
		.forEach(System.out::println);
	}

}
