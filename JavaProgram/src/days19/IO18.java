package days19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IO18 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String dirPath = "D:\\JAVA01\\Java_se\\temp";				
		
		File dir = new File(dirPath);
		if(!dir.exists()) dir.mkdir();	
		File file = new File(dir, "Point.txt");
		
		ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		ArrayList<Point> list=(ArrayList<Point>) ois.readObject();
		int i = 1;
		for (Point point : list) {
			System.out.print(point.toString() + " ");
			if(i++ % 5 == 0) System.out.println();
		}

	}

}
