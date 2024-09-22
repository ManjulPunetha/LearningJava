package filesJava;
import java.io.File;
public class CreateFile {

	public static void main(String[] args) {
		File file = new File("newFile.txt");
		try {
			if(file.createNewFile())    //createNewFile is boolean, return true if file is created
				System.out.println("File created: "+file.getName());  //getName() gets file name
			else
				System.out.println("File already exists");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		

}
