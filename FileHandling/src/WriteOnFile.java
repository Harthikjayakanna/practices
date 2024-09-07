import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteOnFile {
	public static void main(String[] args) {
		FileWriter fr=null;
		try {
			fr=new FileWriter("File.txt");
//		String s="Hello writer,"+"\n"+" Hi You have ordered a product from our site";
			String s= new String(Files.readAllBytes(Paths.get("D:\\Programs\\Identifyuniquecharacter.txt")));
			fr.write(s);
			System.out.println("Content written in the files ");
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
	}
	

}
