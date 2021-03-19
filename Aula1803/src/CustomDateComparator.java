package example;

import java.time.LocalDate;
import java.util.Comparator;

public class CustomDateComparator implements Comparator<LocalDate> {

	@Override
	public int compare(LocalDate o1, LocalDate o2) {
		return o1.compareTo(o2);
	}
}
