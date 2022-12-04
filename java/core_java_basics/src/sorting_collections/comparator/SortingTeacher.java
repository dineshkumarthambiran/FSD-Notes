package sorting_collections.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTeacher {
	public static void main(String[] args) {
		List<Teacher> list = Arrays.asList(
				new Teacher(123,  "Shankar", "Bengaluru"),
				new Teacher(120,  "Sushmita", "Hyderabad"),
				new Teacher(121,  "Amit", "Delhi"),
				new Teacher(122,  "Janaki", "Bengaluru")
				);
		
		Collections.sort(list);
		System.out.println("Sorting using the natural ordering:");
		for(Teacher t: list) {
			System.out.println(t);
		}
		
		Collections.sort(list, new SortByLocationLength());
		
		System.out.println("Sorting using the custom ordering (By Location length):");
		for(Teacher t: list) {
			System.out.println(t);
		}
		
		Collections.sort(list, new Comparator<Teacher>() {
			public int compare(Teacher t1, Teacher t2) {
				return t1.getTeacherName().compareTo(t2.getTeacherName());
			}
		});
		
		System.out.println("Sorting using the custom ordering (By Name ASCII):");
		for(Teacher t: list) {
			System.out.println(t);
		}
		
		Comparator<Teacher> sortById = (t1, t2)-> t1.getTeacherId() - t2.getTeacherId();
		
		Collections.sort(list, sortById);
		
		System.out.println("Sorting using the custom ordering (By ID):");
		for(Teacher t: list) {
			System.out.println(t);
		}
	}
}
