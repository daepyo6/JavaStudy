package days19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Point implements Serializable{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(x:"+x+", y:"+y+")";
	}
}

public class IO17 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 랜덤한 x,y값을 같은 객체 100개를 만들어서 ArrayList에 저장하고, 그 ArrayList를 파일에 저장
		ArrayList<Point> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			Point p = new Point((int)(Math.random()*100), (int)(Math.random()*100));
			list.add(p);
		}
		
		String dirPath = "D:\\JAVA01\\Java_se\\temp";				
		
		File dir = new File(dirPath);
		if(!dir.exists()) dir.mkdir();	
		File file = new File(dir, "Point.txt");
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		
		oos.writeObject(list);
		
		oos.close();
		
	}

}
