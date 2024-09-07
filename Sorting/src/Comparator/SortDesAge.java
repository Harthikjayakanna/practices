package Comparator;

import java.util.Comparator;

public class SortDesAge implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o2.age-o1.age;
	}
	

}
