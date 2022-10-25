package days19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO11 {

	public static void main(String[] args) throws IOException {
	
		String dirName = "D:\\JAVA01\\Java_se\\temp";
		
		File dir = new File(dirName);
		if(!dir.exists())
			dir.mkdirs();
		
		File fileText = new File(dir, "abc.txt");
		FileReader frText = new FileReader(fileText);
		
		int dataText;
		dataText = frText.read();
		while(dataText != -1) {
			System.out.print((char)dataText);
			dataText = frText.read();
		}
	}

}
