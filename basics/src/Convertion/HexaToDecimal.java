package Convertion;

public class HexaToDecimal {
	static void convert(String st) {
		int num=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>=48 &&ch<=57) {
				int val=ch-48;
				num=16*num+val;}
			else if(ch>=65 && ch<=91){
				int val=ch-55;
				num=16*num+val;
			}
		}
		System.out.println(num);
		
	}
	public static void main(String[] args) {
		  String st="3F395";
		  convert(st);
	}

}
