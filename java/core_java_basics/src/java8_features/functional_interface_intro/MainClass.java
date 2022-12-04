package java8_features.functional_interface_intro;

public class MainClass {

	public static void main(String[] args) {
		FunctionalInterfaceExample1 obj = new FunctionalInterfaceExample1() {	
			@Override
			public void abstractMethod1() {
				System.out.println("Abstract method implemented...");
			}
			
			public void defaultMethod() {
				FunctionalInterfaceExample1.super.defaultMethod();
				System.out.println("My Own default method implementation");
			}
			
//			public static void staticMethod() {
//				staticMethod();
//				System.out.println("Static method overriden");
//			}
		};
		
		obj.defaultMethod();
		FunctionalInterfaceExample1.staticMethod();
	}
}
