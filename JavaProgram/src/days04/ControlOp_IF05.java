package days04;

import java.util.Scanner;

public class ControlOp_IF05 {

	public static void main(String[] args) {
		// 출생년도를 입력받아서 나이를 계산 : 2022 - 출생년도 + 1
		// 12미만은 어린이, 12~18세는 청소년, 19~25세는 청년, 26~40세는 성년, 41~60세는 중년, 61세 이상은 노년입니다.
		
		int year, age;
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도를 입력 : ");
		year = scanner.nextInt();
		age = 2022 - year + 1;
		
		if(age<12){
			System.out.println("어린이");
		}else if(age>=12 && age<=18){
			System.out.println("청소년");
		}else if(age>=19 && age<=25){
			System.out.println("청년");
		}else if(age>=26 && age<=40){
			System.out.println("성년");
		}else if(age>=41 && age<=60){
			System.out.println("중년");
		}else {
			System.out.println("노년");
		}
		
	}

}
