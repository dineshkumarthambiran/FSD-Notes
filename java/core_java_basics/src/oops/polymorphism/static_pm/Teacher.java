package oops.polymorphism.static_pm;

public class Teacher {
	private int teacherId;
	private String teacherName;
	private String schoolName;
	private String city;
	
	Teacher(int teacherId, String... values){
		this.teacherId = teacherId;
		teacherName = values[0];
		schoolName = values[1];
		city = values[2];
	}
	
	public void printDetails() {
		System.out.println(teacherId);
		System.out.println(teacherName);
		System.out.println(schoolName);
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher(1133, "Rose", "RM", "Chennai");
		teacher.printDetails();
	}
}
