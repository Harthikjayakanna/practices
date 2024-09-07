
public class AcentureProgram {
	static void change(String str) {
		String temp=str;
		String word="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90) {
				System.out.println(word);
				word="";
				word+=(char)(ch+32);
			}
			else if(i==str.length()-1) {
				word+=(char)(ch-32);
				System.out.println(word);
			}
			else
				word+=(char)(ch-32);
		}
	}
	public static void main(String[] args) {
		String str="hellowWelcomeWhatAreYou";
		change(str);
	}
}
