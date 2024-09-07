package SubString;

public class Uniquelongestlength {
	 public static int lengthOfLongestSubstring(String s) {
	        String word="";
	        int n=1;
	        while(n<=s.length()){
	        for(int i=0;i<=s.length()-n;i++){
	            String temp="";
//	            System.out.println(s);
	            for(int j=i;j<i+n;j++){
	                char ch=s.charAt(j);
//	                System.out.println(ch);
	                if(temp.indexOf(ch)==-1)
	                   temp+=ch;
	                else
	                break; 
	            }
	            if(temp.length()>word.length())
	                word=temp;
	        }
	        n++;
	        }
	        return word.length();
	    }
	public static void main(String[] args) {
		String s ="fgthrthee";
	    int g =lengthOfLongestSubstring(s);
		System.out.println(g);
	}

}
