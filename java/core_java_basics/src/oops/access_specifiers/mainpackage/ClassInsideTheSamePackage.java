package oops.access_specifiers.mainpackage;

public class ClassInsideTheSamePackage {
	public void accessVariables() {
		VariableSource vs = new VariableSource();
		System.out.println(vs.privateVar);
		System.out.println(vs.defaultVar);
		System.out.println(vs.protectedVar);
		System.out.println(vs.publicVar);
	}
}
