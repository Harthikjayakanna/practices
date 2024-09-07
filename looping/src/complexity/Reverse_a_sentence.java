package complexity;

public class Reverse_a_sentence {
public static void main(String[] args) {
	String str="hello here I'm Jerold";
	String rev="";
	String temp="";
	for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		if(i==0||ch==' ') 
		{
			if(i==0) 
			{
			temp=temp+ch;
			}
			for(int j=temp.length()-1;j>=0;j--) {
				char tp=temp.charAt(j);
				rev=rev+tp;
			}
			if(i!=0) {
				rev=rev+' ';
				temp=" ";
			}
		}
		else
		{
			temp=temp+ch;  //dlorej i=15
		}
	}
	System.out.println(rev);
}
}
