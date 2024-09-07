import java.io.File;

public class FileCreation {
	public static void main(String[] args) {
		File fi=new File("File.txt");
		try {
			fi.createNewFile();
			System.out.println("File created");
			if(fi.exists()) {
				System.out.println(" File path : "+fi.getAbsolutePath());
				System.out.println("File name : "+fi.getName());
				
			}
			else
				System.out.println("File not created");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
