package filesJava;
import java.io.FileWriter;
public class WriteToFile {

	public static void main(String[] args) {
		String str = "My name is Manjul";
		try {
			//creates a writer
			FileWriter output = new FileWriter("newFile.txt");
			//writes to file
			output.write(str);
			System.out.println("Written to the file");
			output.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
