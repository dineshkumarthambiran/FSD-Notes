package oops.access_specifiers.subpackage;

import oops.access_specifiers.mainpackage.VariableSource;

public class SubClassOutSideThePackage extends VariableSource{
	public void accessVariables() {
		SubClassOutSideThePackage vs = new SubClassOutSideThePackage();
		System.out.println(vs.privateVar);
		System.out.println(vs.defaultVar);
		System.out.println(vs.protectedVar);
		System.out.println(vs.publicVar);
	}
}
