package oops.polymorphism.dynamic_pm;

public class Manager extends Employee{
	Manager(){
		super("");
		System.out.println("Manager class constructor");
	}
	
	@Override
	public void work() {
		System.out.println("Manager supervises");
	}
	
	@Override
	public void getSalary() {
		super.getSalary();
		super.work();
//		float basicSalary = 20000, ta = 2000, hra = 3000;
//		System.out.println("Salary = "+(basicSalary+ta+hra));
		System.out.println("Get Salary method from the Child class");
	}
}
