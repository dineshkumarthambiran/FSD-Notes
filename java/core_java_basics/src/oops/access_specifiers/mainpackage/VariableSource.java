package oops.access_specifiers.mainpackage;

public class VariableSource {
	
	private String privateVar = "Private variable";
	String defaultVar = "Default variable";
	protected String protectedVar = "Protected variable";
	public String publicVar = "Public variable";
	
	public void accessVariables() {
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}
}
