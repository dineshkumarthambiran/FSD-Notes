package interfaces_example;

public class CitizenWithOnlyBikeLicense implements BikeLicense{

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
}
