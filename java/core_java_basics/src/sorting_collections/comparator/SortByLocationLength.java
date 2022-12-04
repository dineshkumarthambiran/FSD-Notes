package sorting_collections.comparator;

import java.util.Comparator;

public class SortByLocationLength implements Comparator<Teacher>{

	@Override
	public int compare(Teacher o1, Teacher o2) {
		return o1.getLocation().length() - o2.getLocation().length();
	}
	
}
