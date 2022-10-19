package days07;

import java.util.Scanner;

public class ControlOp_while06 {

	public static void main(String[] args) {
		int com = 0, user;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("가위(0)/바위(1)/보(2) 중 하나를 입력, 종료(9) : ");
		user = sc.nextInt();
		
		// 둘을 비교하여 가위바위보 결과 출력
		String str1, str2;
		
		while(user != 9 && (user == 0||user == 1||user == 2)) {
			com = (int)(Math.random()*3);
			
			if(com==0) str1 = "가위";
			else if(com==1) str1 = "바위";
			else str1 = "보";
			
			if(user==0) str2 = "가위";
			else if(user==1) str2 = "바위";
			else str2 = "보";
			
			System.out.println("컴퓨터 : "+str1+", 유저 : "+str2);
			
			if(user == com)System.out.println("무승부입니다."); 
			else if(user==0 && com==2) System.out.println("이겼습니다."); 
			else if(user==1 && com==0) System.out.println("이겼습니다."); 
			else if(user==2 && com==1) System.out.println("이겼습니다."); 
			else System.out.println("졌습니다.");
			
			System.out.printf("가위(0)/바위(1)/보(2) 중 하나를 입력, 종료(9) : ");
			user = sc.nextInt();
			
		}
		System.out.println("종료.");
	}

}
