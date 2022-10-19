package days05;

import java.util.Scanner;

public class ControlOP_IF08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot;
		double avg;
		
		System.out.printf("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.printf("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.printf("수학점수 입력 : ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
/*		if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("합격");
		}else if(avg<60){
			System.out.println("불합격 : 평균미달");
		}else if(kor<40) {
			System.out.println("불합격 : 국어과락");
		}else if(eng<40) {
			System.out.println("불합격 : 영어과락");
		}else if(mat<40) {
			System.out.println("불합격 : 수학과락");
		}*/
		
		// 
		
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("합격");
		}else {
			System.out.printf("불합격 : ");
			if(avg<60) System.out.printf("평균미달 ");
			if(kor<40) System.out.printf("국어과락 ");
			if(eng<40) System.out.printf("영어과락 ");
			if(mat<40) System.out.printf("수학과락 ");
		}
		
	}
	
}
