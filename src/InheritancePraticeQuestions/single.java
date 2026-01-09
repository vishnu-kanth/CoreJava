package InheritancePraticeQuestions;

public class single {
	static class Person{
		String name;
		int age;
		
		Person(String name,int age){
			this.name = name;
			this.age = age;
		}
		
	}
	
	static class Student extends Person{
		int rollNo;
		int marks;
		
		Student(String name,int age,int rollNo,int marks){
			super(name, age);
			this.rollNo=rollNo;
			this.marks=marks;
			
		}
	}
	public static void main(String args[]) {
		Student s = new Student("Vishnu",21,3,87);
		System.out.println("Name: " +s.name);
		System.out.println("Age: " +s.age);
		System.out.println("RollNo: " +s.rollNo);
		System.out.println("Marks: " + s.marks);
		
	}
}
