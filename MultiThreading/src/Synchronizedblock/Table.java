package Synchronizedblock;

public class Table {
	public void print(int n) {
		System.out.println("Table "+n);
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(i+" * "+n+" = "+n*i);
			}
		}
		System.out.println("......................");
	}

}
