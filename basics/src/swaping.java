
public class swaping {
public static void main(String[] args) {
	int j=3;
	int s=5;
	int m=0;
//	m=j;
//	j=s;
//	s=m;
	j=j+s; //3+5=8
	s=j-s;  //8-5=3
	j=j-s;
	System.out.println(j);
	System.out.println(s);
	System.out.println("j="+ j +" "+"s="+s);

}
}
