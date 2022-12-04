package oops.polymorphism.static_pm;

public class MainClassConstOvrLdng {
	public static void main(String[] args) {
		Student varun = new Student();
		varun.displayDetails();
		
		Student vikram = new Student("Vikram", "AV");
		vikram.displayDetails();
		
		Student vijay = new Student(167, "Vijay Kumar", "TST");
		vijay.displayDetails();
	}
}
