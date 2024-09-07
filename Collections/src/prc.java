import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class prc {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(5);ts.add(2);ts.add(7);ts.add(4);ts.add(9);
		System.out.println(ts);
		Iterator<Integer> it= ts.descendingIterator();
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(it.hasNext()) {
			int n=it.next();
			System.out.print(n+" ");
			al.add(n);
		}
		System.out.println(al);
		ListIterator<Integer> ite=al.listIterator(al.size());
		while(ite.hasPrevious()) {
			System.out.print(ite.previous());
		}
	}

}
