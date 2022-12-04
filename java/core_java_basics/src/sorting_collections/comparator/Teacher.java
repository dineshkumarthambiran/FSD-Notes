package sorting_collections.comparator;

public class Teacher implements Comparable<Teacher>{
	private Integer teacherId;
	private String teacherName;
	private String location;
	
	Teacher(Integer teacherId, String teacherName, String location){
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.location = location;
	}
	
	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int compareTo(Teacher t1) {
		return this.teacherName.length() - t1.teacherName.length();
	}
	
	public String toString() {
		return teacherId+" : "+teacherName+" : "+location;
	}
}
