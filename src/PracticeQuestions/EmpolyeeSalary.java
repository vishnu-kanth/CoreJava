package PracticeQuestions;

public class EmpolyeeSalary {
	private double salary;
//	EmpolyeeSalary(){
//		
//	}
//	
//	EmpolyeeSalary(double salary){
//		this.salary=salary;
//	}
//	
	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("Salary is negitive");
			return;
		}
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
		
	}
	
	public static void main(String args[]) {
		EmpolyeeSalary e = new EmpolyeeSalary();
		e.setSalary(300000.0);
		System.out.println(e.getSalary());
	}
}
