import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleReader {
	public static void main(String[] args) {
		String sh="";
		try {
		   sh=new String(Files.readAllBytes(Paths.get("D:\\Programs\\Identifyuniquecharacter.txt")));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(sh);
	}

}
