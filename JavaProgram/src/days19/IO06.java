package days19;

import java.io.File;
import java.io.IOException;

public class IO06 {

	public static void main(String[] args) throws IOException {
		// 파일처리
		// Flie 클래스 : 파일 또는 디렉토리에 관련된 메타정보를 제공하는 클래스
		// 파일을 생성, 디렉토리를 생성등의 추가적인 기능을 제공
		
		// D:\JAVA01\Java_se\temp 폴더를 참조하는 File객체를 생성
		String dir = "D:\\JAVA01\\Java_se\\temp";
		File d = new File(dir);
		System.out.println(dir);
		
		// exists() : 생성자에 입력한 경로가 실제로 있는지 검사후 있으면 true, 없으면 false 리턴
		if(d.exists()) {
			System.out.println("temp dir 발견");
		}else {
			System.out.println("temp dir가 없어서 새로 생성");
			d.mkdirs();	// 디렉토리를 생성하는 메소드
			// mkdir : 최종 타겟 이전의 경로가 존재해야 동작
			// mkdirs : 최종 타겟 이전의 경로가 존재하지 않아도 전체 경로를 생성
		}
		
		File f = new File(d, "msg.txt");
		// d 객체가 갖고있는 경로와 함꼐 해당파일을 f객체에 설정. 아직 파일은 만들어지지 않은 상태
		// File f = new File(d, "D:\\JAVA01\\Java_se\\temp\\msg.txt");
		// 이와 같이 한번에 폴더와 파일명을 설정할 수 있으나 폴더가 없을 수 있기 때문에 
		// 폴더 확인 절차를 거치고 파일을 설정
		
		if(!f.exists()) f.createNewFile(); // 파일 생성 메서드 
		
		System.out.println("파일 명 : " + f.getName());
		System.out.println("파일의 전체경로 : " + f.getAbsolutePath());
		System.out.println("파일의 크기 : " + f.length());
		

	}

}
