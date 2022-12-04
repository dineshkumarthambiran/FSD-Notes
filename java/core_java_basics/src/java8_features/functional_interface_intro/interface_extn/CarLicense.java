package java8_features.functional_interface_intro.interface_extn;

public interface CarLicense {
	void visitRtoOffice();
	
	default void applyForLLR() {
		System.out.println("Car License applied...");
	}
}
