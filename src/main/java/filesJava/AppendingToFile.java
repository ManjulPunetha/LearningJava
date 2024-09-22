package filesJava;
import java.io.*;
public class AppendingToFile {

	public static void main(String[] args) {
		String newline = System.getProperty("line.separator");  //to add newline
		try {
		FileWriter output = new FileWriter("newFile.txt",true);
		output.write(newline+"Appended text");
		System.out.println("Appended to the file");
		output.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
