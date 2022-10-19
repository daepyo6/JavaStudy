package days07;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생이 몇명 ? : ");
		int std = Integer.parseInt(sc.nextLine());
		
		int [] kor = new int[std];
		int [] eng = new int[std];
		int [] mat = new int[std];
		int [] tot = new int[std];
		double [] avg = new double[std];
		String [] name = new String[std];
		
		for (int i = 0; i < std; i++) {
			System.out.print((i+1) + "번 학생 이름 : ");
			name[i] =sc.nextLine();
			System.out.print((i+1) + "번 학생 국어 : ");
			kor[i] =Integer.parseInt(sc.nextLine());
			System.out.print((i+1) + "번 학생 영어 : ");
			eng[i] =Integer.parseInt(sc.nextLine());
			System.out.print((i+1) + "번 학생 수학 : ");
			mat[i] =Integer.parseInt(sc.nextLine());
			
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
		}
		
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < std; i++) {
			System.out.println((i+1)+"\t"+name[i]+"\t\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"
					+ tot[i]+"\t"+ Math.round(avg[i]*10.0)/10.0);
		}
		System.out.println("-----------------------------------------------");
		
		/*
		 * 배열의 크기 : 배열크기는 프로그램에서 중요한 정보입니다.
		 * 배열의 크기에 따라 반복의 횟수나, 특정 인덱스의 값을 참조하는것이 수시로 바뀌기 때문
		 * 배열은 이러한 문제를 해결하기 위해 length라는 속성을 제공
		 * 배열의이름.length -> 배열의 크기, 정수의 타입의 데이터를 얻습니다.
		 */
		
	}

}
