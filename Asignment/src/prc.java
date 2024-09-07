import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;

public class prc {
public static void main(String[] args) {
//	String st="01";
//	String sd="00";
//	System.out.println(sd.equals(st));
//	System.out.println(19%5);
	String data1=new String("data");
	String data2=new String("Data");
	System.out.println(data1=data2);
	int a=10,b=0;
	int div=0;
	try {
	div=a/b;
		System.out.println();
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println();
	}
	catch(ArithmeticException e) {
		System.out.println();
	}
	int abc=102525;int def=121145145;
	System.out.println(def/abc);System.out.println(abc/def);
	java.util.List<Integer> list=Arrays.asList(1,15,3,10,27);
	int sum=list.stream().filter(i->i%3==0).mapToInt(Integer::intValue).sum();
	System.out.println(sum);
	int av[]=new int[20];
	for(int i=0;i<=16;i++) {
		av[i]=i/3;
		av[i]++;
		System.out.print(av[i]+" ");
		i++;
	}
	try {
		Class<?> cls=Class.forName("java.lang.Integer");
		System.out.println(cls.getName());
		System.out.println(cls.getPackage());
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	LinkedList<Integer> ii=new LinkedList<Integer>();
	for(int i=0;i<ii.size();i++) {
		System.out.print(ii.get(i)+ ". ");
	}
	ArrayList<Integer> ai=new ArrayList<Integer>();
	ai.add(1);ai.add((int)'c');ai.add(Integer.valueOf("1"));
	Collections.sort(ai);
	System.out.println(ai);
	System.out.println(6+5.1f);
	System.out.println((int)('+')+" "+(int)('-')+" "+(int)('*')+" "+(int)('/'));
	LinkedList<Object> al =new LinkedList<Object>();
	al.add(1);al.add(5);al.add(9);al.add(3);al.add(34); 
	al.remove(0);al.add(0, 34);System.out.println((int)(al.get(0))+2);
	System.out.println(al);
	int v=5,v1=14;
	int v3=++v1*v/v1+v1;
	System.out.println(v/v1+" "+v3 +" look");
	Hashtable<Integer, String> map=new Hashtable<Integer, String>();
	map.put(100,"in");map.put(102, "usa");map.remove(102);
	System.out.println(map);
	double bp =99.1;
	int ap=78;
	System.out.println(3.14F*11.2F*11.2F);
	System.out.println(al);
	int n=Collections.frequency(al, 34);
	Collections.reverse(al);
	System.out.println(al);
	System.out.println(n);
	Object jero[]=al.toArray();
	int lg[]= {4,5,63,67};
	Arrays.sort(lg);
	System.out.println(Arrays.toString(lg));
    String jk="23";
    int gh=Integer.parseInt(jk);
    System.out.println(gh);
    String kk=String.valueOf(gh);
}   
}
