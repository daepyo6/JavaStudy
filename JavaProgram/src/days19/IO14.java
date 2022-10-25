package days19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO14 {

	public static void main(String[] args) throws IOException {
		String dirPath = "D:\\JAVA01\\Java_se\\temp";				// 원본 폴더 경로
		String dirCopyPath = "D:\\JAVA01\\Java_se\\copy";		// 사본 폴더 경로
		
		File dir = new File(dirPath);
		File copyDir = new File(dirCopyPath);
		if(!copyDir.exists()) copyDir.mkdir();		// 사본 폴더가 없으면 생성
		
		File file = new File(dir, "eclipse-inst-jre-win64.exe");
		File copyFile = new File(copyDir, "eclipse-inst-jre-win64.exe");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFile));
		
		int input;        
		//while ((input = bis.read()) != -1)  bos.write(input);
		byte [] data = new byte[1024];
		int size;		// 맨마지막 입력은 1kb가 안될 수 있으니 size를 사용하여 입력 받은 만큼의 출력을 실행
		while ((size = bis.read()) != -1) {        
			bos.write(data, 0, size);
		}
			    
		bis.close();
		bos.close();
		
		
		

	}

}
