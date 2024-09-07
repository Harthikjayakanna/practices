package Comparator;

import java.util.Comparator;

public class Sortbyage implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		
		return u1.age-u2.age;
	}

}
