package days16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exception05 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		Date inDate = null;
		System.out.print("날짜를 예와 같이 입력하세요 (입력예 : 2015-12-31) : ");
		
		while(true) {
			String s = sc.nextLine();
			try {
				inDate = sdf.parse(s);	// 현재 위치에서 에러발생시 catch로 이동, 에러가 없으면 break 실행
				break;
			} catch (ParseException e) {
				System.out.println("잘못 입력하였습니다. 양식대로 입력해주세요.");
			}
			
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("입력한 날짜 : " + sdf2.format(inDate));
		

	}

}
