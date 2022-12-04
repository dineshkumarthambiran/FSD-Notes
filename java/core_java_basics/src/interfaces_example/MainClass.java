package interfaces_example;

public class MainClass {

	public static void main(String[] args) {
		CitizenWithCarAndBikeLicense dinesh = new CitizenWithCarAndBikeLicense();
		CitizenWithOnlyCarLicense ananth = new CitizenWithOnlyCarLicense();
		CitizenWithOnlyBikeLicense vignesh = new CitizenWithOnlyBikeLicense();
		
		dinesh.applyForLLRForBikeLicense();
		dinesh.payFeeForBikeLicense();
		dinesh.bikeDriveTest();
		
		dinesh.applyForLLRForCarLicense();
		dinesh.payFeeForCarLicense();
		dinesh.carDriveTest();
		
		ananth.applyForLLRForCarLicense();
		ananth.payFeeForCarLicense();
		ananth.carDriveTest();
		
		vignesh.applyForLLRForBikeLicense();
		vignesh.payFeeForBikeLicense();
		vignesh.bikeDriveTest();
	}

}
