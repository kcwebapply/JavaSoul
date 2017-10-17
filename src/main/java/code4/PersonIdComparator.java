package code4;

import java.util.Comparator;

public class PersonIdComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Person)o1).getPersonId().compareTo(
				((Person)o2).getPersonId()
		);
	}

}
