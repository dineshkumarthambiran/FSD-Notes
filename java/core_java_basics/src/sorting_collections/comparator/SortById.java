package sorting_collections.comparator;

import java.util.Comparator;

public class SortById implements Comparator<Teacher>{

	@Override
	public int compare(Teacher o1, Teacher o2) {
		return o1.getTeacherId() - o2.getTeacherId();
	}
}
