package days19;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IO21 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// 특정 날짜를 입력받아서 그 날짜 파일만 출력
		// 날짜입력 양식을 정해서 잘못된 입력은 다시 입력 받게 설정

		String inputData;
		Date iDate;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print("출력할 날짜를 입력(yyyy-MM-dd) : ");
		while (true) {
			try {
				inputData = in.readLine();
				// 연도는 네자리를 전부 입력하지 않아도 넘어가기 때문에 정확히 네자리를 입력한 경우만 다음으로 넘어감
				if (inputData.length() != 10)
					throw new Exception();
				iDate = sdf.parse(inputData);
				break;
			} catch (ParseException e) {
				System.out.println("잘못 입력. yyyy-MM-dd 형식으로 입력하세요.");
			} catch (Exception e) {
				System.out.println("잘못 입력. yyyy-MM-dd 형식으로 입력하세요.");
			}
		}

		// 읽어올 파일 경로 지정
		String dirPath = "D:\\JAVA01\\Java_se\\temp";
		File dir = new File(dirPath);
		String[] f = dir.list();
		// for (String s : f) System.out.println(s);

		for (int i = 0; i < f.length; i++) {
			if (f[i].length() < 10)
				continue; // 파일이름이 10글자 미만이면 다음파일로

			// 앞으로 사용할 메서드가 f[i].substring(0,10); 인데 ,
			// f[i]에 있는 String 글자 갯수가 10개가 안되면 에러입니다.
			// 10글자 이상의 파일이름을 선별하여 실행합니다.

			// 현재 반복 실행중인 파일이름의 날짜에 해당되는 앞 10자를 추출
			String s1 = f[i].substring(0, 10);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy_MM_dd");
			// yyyy-MM-dd -> yyyy_MM_dd 날짜형식 변환 후 이어붙이기해서 String형으로 변환
			String s2 = sdf2.format(iDate) + "";
			if (s1.equals(s2)) {
				File file = new File(dir, f[i]);
				ObjectInputStream ois = 
						new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

				// ObjectInputStream -> ArrayList<CalculatorResult>로 형변환
				ArrayList<CalculatorResult> list = (ArrayList<CalculatorResult>) ois.readObject();

				int count = 1;
				System.out.println(f[i]);
				for (CalculatorResult c : list)
					System.out.println(count++ + ". " + c.toString());
				System.out.println();
				ois.close();
			}
		}
		
	}
}
