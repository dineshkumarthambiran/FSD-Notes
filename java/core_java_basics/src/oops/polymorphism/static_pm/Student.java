package oops.polymorphism.static_pm;

public class Student {
	private int sid;
	private String sName;
	private String schoolName;
	
	public Student(){
		sid = 123;
		sName = "Varun";
		schoolName = "KV";
	}
	
	public Student(int sid, String sName) {
		this.sid = sid;
		this.sName = sName;
		schoolName = "MV";
	}
	
	public Student(String sName, String schoolName) {
		this.sName = sName;
		this.schoolName = schoolName;
		sid = 112233;
	}
	
	public Student(int sid, String sName, String schoolName) {
		this.sid = sid;
		this.sName = sName;
		this.schoolName = schoolName;
	}
	
	public void displayDetails() {
		System.out.println("Sid: "+sid);
		System.out.println("Sname: "+sName);
		System.out.println("School Name: "+schoolName);
	}
}
