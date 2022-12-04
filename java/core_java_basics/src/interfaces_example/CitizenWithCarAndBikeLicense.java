package interfaces_example;

public class CitizenWithCarAndBikeLicense implements BikeLicense, CarLicense{

	@Override
	public void applyForLLRForBikeLicense() {
		System.out.println("Has applied for Bike LLR");
	}

	@Override
	public void payFeeForBikeLicense() {
		System.out.println("Has paid the fee for bike license");
	}

	@Override
	public void bikeDriveTest() {
		System.out.println("Bike Drive test completed");
	}

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
