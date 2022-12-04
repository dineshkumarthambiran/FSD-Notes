package final_keyword;

public final class Student {
	private final String schoolName;
	public static final String COUNTRY = "India";
	public static final float PI = 3.14f;
	
	Student(){
	//If the constant are not initialized during creation it can be initialized using the constructor once
		schoolName = "UV";
	//If the constants are initialized during declaration it can't be initialized even once in the constructor
//		country = "USA";
	}
	
	//final methods can't be overriden
	public final void greetTeacher() {
		System.out.println("Hello Teacher!");
	}
}
