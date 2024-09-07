package Comparator;

import java.util.Comparator;

public class SortyByemail implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.email.toUpperCase().compareTo(u2.email.toUpperCase());
	}

}
