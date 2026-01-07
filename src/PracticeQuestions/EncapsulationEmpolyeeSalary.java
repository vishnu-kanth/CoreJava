package PracticeQuestions;

public class EncapsulationEmpolyeeSalary {
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
		EncapsulationEmpolyeeSalary e = new EncapsulationEmpolyeeSalary();
		e.setSalary(300000.0);
		System.out.println(e.getSalary());
	}
}
