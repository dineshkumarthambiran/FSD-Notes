package oops.classes;

public class Student {
//	Data members
	private int sid;
	private String sName;
	private int sAge;
	
	public void study() {
		System.out.println(sName+" is studying");
	}
	
	public void play() {
		System.out.println(sName+" is playing");
	}
	
	public void giveExam() {
		System.out.println(sName+" gave exam");
	}
	
	public void displayDetails() {
		System.out.println("Student id: "+sid);
		System.out.println("Student name: "+sName);
		System.out.println("Student Age: "+sAge);
	}
}
