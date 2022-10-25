package days19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO13 {

	public static void main(String[] args) throws IOException {
		String dirName = "D:\\JAVA01\\Java_se\\temp";
		
		File dir = new File(dirName);
		if(!dir.exists())
			dir.mkdirs();
		File file_binary = new File(dir, "binary_data_using_buffer.dat");
		File file_text = new File(dir, "text_data_using_buffer.txt");
		
		FileInputStream fis = new FileInputStream(file_binary);
		BufferedInputStream bisBinary = new BufferedInputStream(fis);
		
		BufferedReader brText = new BufferedReader(new FileReader(file_text));
		
		int input;
		while ((input = bisBinary.read()) != -1) {
			System.out.println(input);
		}
		System.out.println();
		while ((input = brText.read()) != -1) {
			System.out.println((char)input);
		}
		
		bisBinary.close();
		brText.close();

	}

}
