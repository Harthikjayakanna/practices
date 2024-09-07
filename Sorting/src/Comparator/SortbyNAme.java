package Comparator;

import java.util.Comparator;

public class SortbyNAme implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		return u1.name.toLowerCase().compareTo(u2.name.toLowerCase());
	}
	

}
