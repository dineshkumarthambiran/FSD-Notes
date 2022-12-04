package interfaces_example;

public class CitizenWithOnlyCarLicense implements CarLicense{

	@Override
	public void applyForLLRForCarLicense() {
		System.out.println("Applied LLR for car licenses");
	}

	@Override
	public void payFeeForCarLicense() {
		System.out.println("Paid the fee for Car License");
	}

	@Override
	public void carDriveTest() {
		System.out.println("Successfully completed the Car Drive Test");
	}

}
