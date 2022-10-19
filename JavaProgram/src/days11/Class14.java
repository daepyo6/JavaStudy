package days11;

import java.util.Scanner;

class Student{
	Scanner sc = new Scanner(System.in);
	
	private int num;
	private String name;
	private int [] scores;
	
	public Student(Student s) {
		// 이미 new Student는 만들어진 상태
		// 전달된 값을 copy만 하면됨
		// Student(String n, int s1, int s2, int s3)에서와 같이 전달값이 따로 전달되던 것을
		// s에 담겨서 한번에 전달한 셈입니다.
		
		num = 4;
		name = s.name;
		scores = new int [3];
		for (int i = 0; i < scores.length; i++) 
			scores[i] = s.scores[i];
	}

	public Student(String n, int s1, int s2, int s3) {
		scores = new int [3];
		
		//System.out.print("번호을 입력 : ");
		//num = Integer.parseInt(sc.nextLine());
		num = 3;
		name = n;
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;
	}

	public Student(String n) {
		scores = new int [3];
		
		//System.out.print("번호을 입력 : ");
		//num = Integer.parseInt(sc.nextLine());
		num = 2;
		name = n;
		for (int i = 0; i < scores.length; i++) {
			//System.out.print((i+1)+"번째 점수를 입력 : ");
			//scores[i] = Integer.parseInt(sc.nextLine());
			scores[i] = (int)(Math.random()*100);
		}
	}

	public Student() {
		scores = new int [3];
		
		//System.out.print("번호을 입력 : ");
		//num = Integer.parseInt(sc.nextLine());
		num = 1;
		//System.out.print("이름을 입력 : ");
		//name = sc.nextLine();
		name = "홍길동";
		for (int i = 0; i < scores.length; i++) {
			//System.out.print((i+1)+"번째 점수를 입력 : ");
			//scores[i] = Integer.parseInt(sc.nextLine());
			scores[i] = (int)(Math.random()*100);
		}
	}

	public void prn() {
		System.out.print("번호 : "+num+"\t이름 : "+name + "\t");
		for (int i = 0; i < scores.length; i++)
			System.out.print("점수" + (i+1) + " : " + scores[i] + "\t");
		System.out.println();
		
	}
}

// 아래 생성자들이 모두 실행이 가능하도록 생성자를 제작
// 모든 생성자에서 scores에 정수 세개를 저장할 배열을 만들고 주소를 저장하도록 코딩하세요

// 매개변수가 없는 생성자는 모든 변수값(번호, 이름, 정수)을 임의로 정한 값으로
// 매개변수에 이름만 전달되는 생성자는 이름을 제외한 모든 변수 값을 임의의 값으로
// 이름과 점수가 전달되는 생성자는 번호만 임의의 값으로 저장하고, 다른 값들은 전달값으로 변수에 대입
// prn() 메서드는 멤버변수들의 값을 이용하여 출력하되 양식은 임의로 설정해주세요

// 전달인수가 클래스객체인 경우 새로운 객체에 각 멤버변수 값을 복사한 객체가 만들어져서 참조값이 리턴되게 코딩

public class Class14 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남", 98, 69, 87);
		Student s4 = new Student(s3);
		
		s1.prn();
		s2.prn();
		s3.prn();
		s4.prn();
		

	}

}
