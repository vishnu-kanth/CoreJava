package oops;

public class OopsPractice {
	static class Student{
		String name;
		int age;
		static String College = "LPU";
		
		public Student() {
			
		}
		
		public Student(String name) {
			this();
			this.name=name;
		}
		
		public Student(String name,int age) {
			this(name);
			this.age=age;
		}
	}
	public static void main(String args[]) {
		Student s1 = new Student("Vishnu Kanth",21);
		Student.College="LPU";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(Student.College);
		
		Student s2 = new Student("Varun Kumar",21);
		Student.College="LPU";
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(Student.College);
	}

}
