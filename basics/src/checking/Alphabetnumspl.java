package checking;

public class Alphabetnumspl {
	public static void main(String[] args) {
		char j='&';
		if((j>='a'&& j<='z') ||(j>='A'&& j<='Z')) {
			System.out.println(j+" is alphabet");
		}
		else if(j>='0' && j<='9') {
			System.out.println(j+" is number");
		}
		else
		{
			System.out.println(j+" is special character");
		}
	}

}
