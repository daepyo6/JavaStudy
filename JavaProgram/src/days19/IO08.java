package days19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IO08 {

	public static void main(String[] args) throws IOException {
		
		String dirName = "D:\\JAVA01\\Java_se\\temp";
		
		File dir = new File(dirName);
		if(!dir.exists())
			dir.mkdirs();
		File fileBinary = new File(dir, "binaryData.dat");
		File fileText = new File(dir, "textData.txt");
		
		// 파일처리
		// File에 데이터를 출력하는 클래스 FileOutputStream(이전 데이터파일 객체), FileWriter(문자데이터파일객체)
		// 파일 출력스트림 객체는 해당 파일이 존재하지 않는경우, 파일을 생성하여 스트림을 구성
		
		// 파일에 이진데이터를 출력할 수 있는 객체 생성 & 해당파일도 생성
		FileOutputStream fosBinary = new FileOutputStream(fileBinary);
		
		// 파일에 문자데이터를 출력할 수 있는 객체 생성 & 해당파일도 생성
		FileWriter fosText = new FileWriter(fileText);
		
		// 파일에 간단내용을 출력합니다.
		fosBinary.write(111);
		fosBinary.write(222);
		fosText.write("Hello");
		fosText.write("World");
		
		fosBinary.close();
		fosText.close();
		// 열었던 파일을 가능한 꼭 닫아주세요. 닫지 않아도 운영체제의 운영특성상 닫히지만,
		// 간혹 안닫힌 파일이 쌓여서 오류를 일으키는 경우가 있습니다.
		
	}

}
