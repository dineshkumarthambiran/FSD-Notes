package oops.polymorphism.dynamic_pm;

public class Employee {
	
	Employee(){
		this("");
		System.out.println("Default constructor of the Parent");
	}
	
	Employee(String msg){
		System.out.println("Parameterized constructor of the Parent");
	}
	
	public void work() {
		System.out.println("Employee works");
	}
	public void getSalary() {
//		float basicSalary = 10000;
//		System.out.println(basicSalary);
		System.out.println("Get Salary method from the Parent class");
	}
}
