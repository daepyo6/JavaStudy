package days10;

import java.util.Scanner;

// 멤버 메서드의 역할은 은닉자료의 접근만 있는 것은 아닙니다.
// 멤버자료의 유효한 값의 관리와 가공을 담당하기도 합니다.

class AccountWithPermission {
	private double balance;
	Scanner sc = new Scanner(System.in);

	public void initBalance(int money) {
		balance = money;
	}

	public void withdraw() {
		System.out.print("출금할 금액을 입력 : ");
		int money = Integer.parseInt(sc.nextLine());

		System.out.print("비밀번호 네자리 입력 : ");
		int pass = Integer.parseInt(sc.nextLine());

		if (pass != 1234) {
			System.out.println("비밀번호가 맞지 않습니다.");
			return; // void 메서드에서 뒤에 값이 사용되는 return은 메서드를 그 지점에서 종료하라는 명령이 됩니다.
		}

		if (money > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		balance -= money;
		System.out.println(money + "원 출금이 완료되었습니다.");
		display();
	}

	public void display() {
		System.out.println("현재 잔액은 " + Math.round(balance) * 100 / 100.0 + "원 입니다.");
	}

	public void deposit() {
		System.out.print("입금할 금액을 입력하세요 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		if (money <= 0) {
			System.out.println("입금 금액 오류. 관리자에게 문의하세요");
			return;
		}
		balance += money;
		System.out.println(money + "원 입금이 완료되었습니다.");
		display();
	}
}

public class Class06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectMenu;
		
		AccountWithPermission a = new AccountWithPermission();
		a.initBalance(50000);
		
		System.out.print("메뉴선택 : 1. 입금  2. 출금  3. 잔액확인  4. 종료  : ");
		selectMenu = Integer.parseInt(sc.nextLine());
		
		while(selectMenu!=4) {
			switch(selectMenu) {
			case 1:
				a.deposit();
				break;
			case 2:
				a.withdraw();
				break;
			case 3:
				a.display();
				break;
			}
			System.out.print("메뉴선택 : 1. 입금  2. 출금  3. 잔액확인  4. 종료  : ");
			selectMenu = Integer.parseInt(sc.nextLine());
		}
		System.out.println("프로그램이 종료되었습니다.");
	
	}
	
}


