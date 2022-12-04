package java8_features.functional_interface_intro;

@FunctionalInterface
public interface FunctionalInterfaceExample1 {
	public void abstractMethod1();
	
	//Non static / instance method
	public default void defaultMethod() {
		System.out.println("This is a default method");
	}
	
	public static void staticMethod() {
		System.out.println("This is a static method");
	}
}
