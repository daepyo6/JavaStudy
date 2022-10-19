package days05;

import java.util.Scanner;

public class ControlOP_IF09 {

	public static void main(String[] args) {
		
		int comNum = (int)(Math.random()*3);
		String com = "보";
		
		if(comNum==0) com = "가위";
		else if(comNum==1) com = "바위";
		else com = "보";
		
		Scanner sc = new Scanner(System.in);
		String user;
		System.out.printf("가위/바위/보 중 하나를 입력 : ");
		user = sc.nextLine();
		
		System.out.println("user : " + user + ", com : " + com);
		
		/*
		 * if(user.equals(com)) System.out.println("무승부입니다."); 
		 * else if(user.equals("가위") &&com.equals("바위")) System.out.println("졌습니다."); 
		 * else if(user.equals("가위") && com.equals("보")) System.out.println("이겼습니다."); 
		 * else if(user.equals("바위") && com.equals("보")) System.out.println("졌습니다."); 
		 * else if(user.equals("바위") && com.equals("가위")) System.out.println("이겼습니다.");
		 * else if(user.equals("보") && com.equals("가위")) System.out.println("졌습니다."); 
		 * else if(user.equals("보") && com.equals("바위")) System.out.println("이겼습니다.");
		 */
		
		
		if(user.equals(com)) System.out.println("무승부입니다."); 
		else if(user.equals("가위") && com.equals("보")) System.out.println("이겼습니다."); 
		else if(user.equals("바위") && com.equals("가위")) System.out.println("이겼습니다.");
		else if(user.equals("보") && com.equals("바위")) System.out.println("이겼습니다.");
		else System.out.println("졌습니다.");
		
		if(user.equals(com)) {
			System.out.println("무승부입니다.");
		}else{
			if(com.equals("가위")) {
				if(user.equals("바위")) System.out.println("이겼습니다.");
				else System.out.println("졌습니다.");
			}else if(com.equals("바위")) {
				if(user.equals("보")) System.out.println("이겼습니다.");
				else System.out.println("졌습니다.");
			}else if(com.equals("보")) {
				if(user.equals("가위")) System.out.println("이겼습니다.");
				else System.out.println("졌습니다.");
			}
		}	
	}
}
