package oops.instantiating_abstract_interfaces.task;

public class MainClass {
	public static void main(String[] args) {
		BikeLicense bikeLicense = new BikeLicense() {
			@Override
			public void payFee() {
				System.out.println("Pay fee");
			}
			
			@Override
			public void driveTest() {
				System.out.println("Drive Test");
			}
			
			@Override
			public void applyForLLR() {
				System.out.println("LLR Applied");
			}
		};
		
		bikeLicense.applyForLLR();
		bikeLicense.payFee();
		bikeLicense.driveTest();
	}
}
