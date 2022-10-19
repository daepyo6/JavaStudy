package days03;

import java.util.Scanner;

public class Variable05 { 
	public static void main(String[] args) {
		// 이름과 국영수 점수를 입력 받아서 1명의 성적표를 총점 평균과 함께 출력
		int kor, eng, mat, tot;
		double avg;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("이름을 입력하세요 : ");
		name = scanner.nextLine();
		System.out.printf("국어 점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.printf("영어 점수를 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.printf("수학 점수를 입력하세요 : ");
		mat = scanner.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%3d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",
				1, name, kor, eng, mat, tot, avg);
		System.out.printf("-----------------------------------------------\n");
		System.out.println("  1\t"+name+"\t\t"+kor+"\t"+eng+"\t"+mat+"\t"
				+ tot+"\t"+ (int)(avg*10)/10.0);
		System.out.println("-----------------------------------------------");
	}
}
