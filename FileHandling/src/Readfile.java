import java.io.FileReader;
import java.io.IOException;

public class Readfile {
	public static void main(String[] args) {
		FileReader fr=null;
		String che="";
		try {
			fr=new FileReader("D:\\Programs\\Identifyuniquecharacter.txt");
			int i;
			while((i=fr.read())!=-1) {
				char ch=(char)i;
				che+=ch;}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print(che);
	}

}
