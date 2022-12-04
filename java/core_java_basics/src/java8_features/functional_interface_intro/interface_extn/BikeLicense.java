package java8_features.functional_interface_intro.interface_extn;

public interface BikeLicense {
	void visitRtoOffice();
	default void applyForLLR() {
		System.out.println("Bike License applied...");
	}
}
