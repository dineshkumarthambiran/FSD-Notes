package java8_features.functional_interface_intro.interface_extn;

public class Citizen implements BikeLicense, CarLicense{
	@Override
	public void visitRtoOffice() {
		System.out.println("Visited RTO Office...");
	}
	
	@Override
	public void applyForLLR() {
		BikeLicense.super.applyForLLR();
		CarLicense.super.applyForLLR();
		System.out.println("A citizen can have both the licenses...");
	}

}
