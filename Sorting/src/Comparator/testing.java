package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class testing {
	public static void main(String[] args) {
		ArrayList<User> al = new ArrayList<User>();
		al.add(new User("Jerold", 23,"jerold12"));
		al.add(new User("jeron", 24,"jeron12"));
		al.add(new User("ajish", 23,"ajish12"));
		al.add(new User("Mani", 24,"mani12"));
		al.add(new User("Sanjay" , 20,"sanjay12"));
		System.out.println("Sorted by ages");
		Collections.sort(al, new Sortbyage());
        for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
        System.out.println("Sorting by age in desending order");
        Collections.sort(al, new SortDesAge());
        for(User u : al) {
        	System.out.println(u);
        }
        System.out.println("Sorty by Name");
        Collections.sort(al,new SortbyNAme());
        for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
        System.out.println("Sorty by Email");
        Collections.sort(al,new SortyByemail());
        for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
	}

}
